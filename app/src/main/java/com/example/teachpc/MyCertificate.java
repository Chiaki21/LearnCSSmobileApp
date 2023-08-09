package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyCertificate extends AppCompatActivity {

    SharedPreferences sharedPreferencescoc1,sharedPreferencescoc2,sharedPreferencescoc3,sharedPreferencescoc4;

    private static final String coc1pref = "coc1pref";
    private static final String coc1success = "coc1success";

    private static final String coc2pref = "coc2pref";
    private static final String coc2success = "coc2success";

    private static final String coc3pref = "coc3pref";
    private static final String coc3success = "coc3success";

    private static final String coc4pref = "coc4pref";
    private static final String coc4success = "coc4success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_certificate);

        getWindow().setStatusBarColor(ContextCompat.getColor(MyCertificate.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("My Certificates");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final LinearLayout coc_category1 = findViewById(R.id.coc_category1);
        final LinearLayout coc_category2 = findViewById(R.id.coc_category2);
        final LinearLayout coc_category3 = findViewById(R.id.coc_category3);
        final LinearLayout coc_category4 = findViewById(R.id.coc_category4);


        sharedPreferencescoc1 = getSharedPreferences(coc1pref,MODE_PRIVATE);
        sharedPreferencescoc2 = getSharedPreferences(coc2pref,MODE_PRIVATE);
        sharedPreferencescoc3 = getSharedPreferences(coc3pref,MODE_PRIVATE);
        sharedPreferencescoc4 = getSharedPreferences(coc4pref,MODE_PRIVATE);

        TextView coc1dec = findViewById(R.id.coc1dec);



        String coc1pass = sharedPreferencescoc1.getString(coc1success,null);
        String coc2pass = sharedPreferencescoc2.getString(coc2success,null);
        String coc3pass = sharedPreferencescoc3.getString(coc3success,null);
        String coc4pass = sharedPreferencescoc4.getString(coc4success,null);

        coc_category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coc1pass != null){
                    Intent intent = new Intent(MyCertificate.this,coc1cert.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MyCertificate.this,nullcert.class);
                    startActivity(intent);
                }

            }
        });

        coc_category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coc2pass != null){
                    Intent intent = new Intent(MyCertificate.this,coc2cert.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MyCertificate.this,nullcert.class);
                    startActivity(intent);
                }
            }
        });

        coc_category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coc3pass != null){
                    Intent intent = new Intent(MyCertificate.this,coc3cert.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MyCertificate.this,nullcert.class);
                    startActivity(intent);
                }
            }
        });

        coc_category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (coc4pass != null){
                    Intent intent = new Intent(MyCertificate.this,coc4cert.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MyCertificate.this,nullcert.class);
                    startActivity(intent);
                }
            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(MyCertificate.this,Quizzes.class));
        finish();
    }
}