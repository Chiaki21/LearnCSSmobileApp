package com.example.teachpc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.teachpc.Utility.NetworkChangeListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class coc extends AppCompatActivity implements View.OnClickListener {

    public RelativeLayout coc1,coc2,coc3,coc4;

    NetworkChangeListener networkChangeListener = new NetworkChangeListener();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc);


        getWindow().setStatusBarColor(ContextCompat.getColor(coc.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("Certificate of Competency");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        coc1 = (RelativeLayout) findViewById(R.id.coc1);
        coc2 = (RelativeLayout) findViewById(R.id.coc2);
        coc3 = (RelativeLayout) findViewById(R.id.coc3);
        coc4 = (RelativeLayout) findViewById(R.id.coc4);

        coc1.setOnClickListener(this);
        coc2.setOnClickListener(this);
        coc3.setOnClickListener(this);
        coc4.setOnClickListener(this);


/*
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.coc_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.coc_nav:
                        return true;
                    case R.id.dashboard_nav:
                        startActivity(new Intent(getApplicationContext()
                                ,userHome.class));
                        overridePendingTransition(0,0);
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
}

    @Override
    public void onClick(View view) {

        Intent i;
        switch (view.getId()) {
            case R.id.coc1:
                i = new Intent(this, coc1activity.class);
                startActivity(i);
                break;

            case R.id.coc2:
                i = new Intent(this, coc2activity.class);
                startActivity(i);
                break;
            case R.id.coc3:
                i = new Intent(this, coc3activity.class);
                startActivity(i);
                break;
            case R.id.coc4:
                i = new Intent(this, coc4activity.class);
                startActivity(i);
                break;


    }

}@Override
    public void onBackPressed() {
        startActivity(new Intent(coc.this, userHome.class));
        finish();

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