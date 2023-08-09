package com.example.teachpc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teachpc.Utility.NetworkChangeListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class userHome extends AppCompatActivity implements View.OnClickListener {

    AlertDialog.Builder builder;

    public CardView card1, card2, card3, card4, card5,card6;
    private ImageView logout;

    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;


    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        getWindow().setStatusBarColor(ContextCompat.getColor(userHome.this, R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        card1 = (CardView) findViewById(R.id.pcparts);
        card2 = (CardView) findViewById(R.id.aboutpc);
        card3 = (CardView) findViewById(R.id.quizzes);
        card4 = (CardView) findViewById(R.id.tutorials);
        card5 = (CardView) findViewById(R.id.detector);
        card6 = (CardView) findViewById(R.id.coc);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);



        logout = (ImageView) findViewById(R.id.signOut);

        /*

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.dashboard_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.coc_nav:
                        startActivity(new Intent(getApplicationContext()
                        ,coc.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.dashboard_nav:
                        return true;
                    case R.id.about_nav:
                        startActivity(new Intent(getApplicationContext()
                                ,AboutUs.class));
                        overridePendingTransition(0,0);


                }
                return false;
            }
        });
         */

  builder = new AlertDialog.Builder(this);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.tensorflow.lite.examples.objectdetection");

                if(launchIntent != null){
                    startActivity(launchIntent);
                } else{
                    builder.setTitle("External file need to open detector!")
                            .setMessage("Download external file?")
                            .setCancelable(true)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    gotoUrl("https://drive.google.com/uc?export=download&id=1v9jDok-1EXlOBfGatdGwk8rkLdOwAJlA");
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            }).show();
                }
            }
        });


        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        final TextView welcomeuserTextView = (TextView) findViewById(R.id.welcomeuser);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userprofile = snapshot.getValue(User.class);

                if (userprofile != null) {
                    String welcomeuser = userprofile.firstName;

                    welcomeuserTextView.setText(welcomeuser);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(userHome.this, "Something is wrong!", Toast.LENGTH_LONG).show();

            }
        });

        builder = new AlertDialog.Builder(this);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("Log Out")
                        .setMessage("You sure you want to log out?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                FirebaseAuth.getInstance().signOut();
                                SharedPreferences sharedPreferences = getSharedPreferences(LoginUser.PREFS_NAME, 0);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putBoolean("hasLoggedIn", false);
                                editor.commit();
                                startActivity(new Intent(userHome.this, LoginUser.class));
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }).show();


            }
        });
    }


    @Override
    public void onBackPressed() {
    }

    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.pcparts:
                i = new Intent(this, PCParts.class);
                startActivity(i);
                break;

            case R.id.aboutpc:
                i = new Intent(this, AboutPC.class);
                startActivity(i);
                break;
            case R.id.tutorials:
                i = new Intent(this, Tutorials.class);
                startActivity(i);
                break;

            case R.id.quizzes:
                i = new Intent(this, Quizzes.class);
                startActivity(i);
                break;

            case R.id.coc:
                i = new Intent(this, coc.class);
                startActivity(i);
                break;






        }

    }

    @Override
    protected void onStart(){
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeListener, filter);
        super.onStart();
    }

    @Override
    protected void onStop(){
        unregisterReceiver(networkChangeListener);
        super.onStop();
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}