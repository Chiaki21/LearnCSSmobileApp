package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public class MainActivityTeachPC extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainteachpc);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivityTeachPC.this,R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
               SharedPreferences sharedPreferences = getSharedPreferences(LoginUser.PREFS_NAME,0);
                boolean hasLoggedIn = sharedPreferences.getBoolean("hasLoggedIn",false);


               if(hasLoggedIn){
                   Intent intent = new Intent(MainActivityTeachPC.this,userHome.class);
                   startActivity(intent);
                   finish();
               }
               else{
                   Intent intent = new Intent(MainActivityTeachPC.this,LoginUser.class);
                   startActivity(intent);
                   finish();
               }
            }
        },SPLASH_TIME_OUT);
    }
}