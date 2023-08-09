package com.example.teachpc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterUser extends AppCompatActivity implements View.OnClickListener{

    private FirebaseAuth mAuth;

    private TextView banner, registerUser,backlogin;
    private EditText editTextFirstName,editTextLastName, editTextAge, editTextEmail, editTextPassword,editTextStudentID;
    private ProgressBar progressBar;

    private CheckBox teacherID;
    boolean passwordVisible;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        getWindow().setStatusBarColor(ContextCompat.getColor(RegisterUser.this, R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        mAuth = FirebaseAuth.getInstance();

        registerUser = (Button)findViewById(R.id.registerUser);
        registerUser.setOnClickListener(this);

        editTextFirstName = (EditText)findViewById(R.id.firstName);
        editTextLastName = (EditText)findViewById(R.id.lastName);
        editTextAge = (EditText)findViewById(R.id.age);
        editTextEmail = (EditText)findViewById(R.id.email);
        editTextPassword = (EditText)findViewById(R.id.password);
        editTextStudentID = (EditText)findViewById(R.id.studentID);
        teacherID = (CheckBox) findViewById(R.id.teacherID);

        backlogin = (TextView) findViewById(R.id.backlogin);
        backlogin.setOnClickListener(this);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        editTextFirstName.setTextColor(Color.WHITE);
        editTextLastName.setTextColor(Color.WHITE);
        editTextAge.setTextColor(Color.WHITE);
        editTextEmail.setTextColor(Color.WHITE);
        editTextPassword.setTextColor(Color.WHITE);
        editTextStudentID.setTextColor(Color.WHITE);

        editTextPassword.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                final int Right=2;
                if(event.getAction()==MotionEvent.ACTION_UP){
                    if(event.getRawX()>=editTextPassword.getRight()-editTextPassword.getCompoundDrawables()[Right].getBounds().width()){
                        int selection=editTextPassword.getSelectionEnd();
                        if(passwordVisible){
                            editTextPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_visibility_off,0);
                            editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordVisible=false;
                        }else{
                            editTextPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_visibility_on,0);
                            editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passwordVisible=true;
                        }
                        editTextPassword.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });


       teacherID.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               editTextStudentID.getText().clear();
               editTextStudentID.setEnabled(false);
               editTextStudentID.setFocusable(false);
           }
       });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backlogin:
                startActivity(new Intent(this, LoginUser.class));
                break;
            case R.id.registerUser:
                registerUser();
                break;
        }
    }
    private void registerUser(){
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String firstName = editTextFirstName.getText().toString().trim();
        String lastName = editTextLastName.getText().toString().trim();
        String age = editTextAge.getText().toString().trim();
        String studentID = editTextStudentID.getText().toString().trim();




        if(firstName.isEmpty()){
            editTextFirstName.setError("First name is required!");
            editTextFirstName.requestFocus();
            return;
        }
        if(firstName.length()>16){
            editTextFirstName.setError("First name max length is 16 characters");
            editTextFirstName.requestFocus();
            return;
        }
        if(lastName.isEmpty()){
            editTextLastName.setError("Last name is required!");
            editTextLastName.requestFocus();
            return;
        }
        if(lastName.length()>16){
            editTextFirstName.setError("Last name max length is 16 characters");
            editTextFirstName.requestFocus();
            return;
        }
        if(age.isEmpty()){
            editTextAge.setError("Age is required!");
            editTextAge.requestFocus();
            return;
        }
        if(email.isEmpty()){
            editTextEmail.setError("Email is required!");
            editTextEmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Email is Invalid!");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPassword.setError("Password is required!");
            editTextPassword.requestFocus();
            return;
        }
        if(password.length()<8){
            editTextPassword.setError("Password Length should be 8 characters above!");
            editTextPassword.requestFocus();
            return;
        }
        if(studentID.isEmpty() && !teacherID.isChecked()){
            editTextStudentID.setError("Student ID is required!");
            editTextStudentID.requestFocus();
            return;
        }
        if(studentID.length()<6 && !teacherID.isChecked()) {
            editTextStudentID.setError("Student ID must be 6 numbers above");
            editTextStudentID.requestFocus();
            return;
        }






        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            User user = new User(firstName,lastName, age, email,studentID);
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    FirebaseUser userverify = FirebaseAuth.getInstance().getCurrentUser();

                                    if(task.isSuccessful()){
                                        userverify.sendEmailVerification();
                                        Toast.makeText(RegisterUser.this,"Check your email inbox or spam to verify your account!", Toast.LENGTH_LONG).show();
                                        startActivity(new Intent(RegisterUser.this, LoginUser.class));
                                        finish();
                                        progressBar.setVisibility(View.GONE);


                                    }else{
                                        Toast.makeText(RegisterUser.this,"Failed to Register! Try Again!",Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);

                                    }

                                }
                            });
                        }else{
                            Toast.makeText(RegisterUser.this,"Failed to Register! Try Again!",Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }

                    }
                });

}
}