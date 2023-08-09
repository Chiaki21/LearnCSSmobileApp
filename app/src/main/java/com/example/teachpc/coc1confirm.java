package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class coc1confirm extends AppCompatActivity {

    private TextView coc1dec;

    SharedPreferences sharedPreferencescoc1;
    private static final String coc1pref = "coc1pref";
    private static final String coc1success = "coc1success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc1confirm);

        getWindow().setStatusBarColor(ContextCompat.getColor(coc1confirm.this,R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton passdata = findViewById(R.id.passdata);

        coc1dec = findViewById(R.id.coc1dec);

        sharedPreferencescoc1 = getSharedPreferences(coc1pref,MODE_PRIVATE);

        String coc1pass = sharedPreferencescoc1.getString(coc1success,null);

        if (coc1pass != null){
            Intent intent = new Intent(coc1confirm.this,coc1cert.class);
            startActivity(intent);
        }



        passdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferencescoc1.edit();

                coc1dec.setText("");
                editor.putString(coc1success,coc1dec.getText().toString());
                editor.apply();
                Intent intent = new Intent(coc1confirm.this,coc1cert.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
    }
}