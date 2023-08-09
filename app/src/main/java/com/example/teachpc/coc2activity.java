package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.teachpc.Utility.NetworkChangeListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class coc2activity extends AppCompatActivity {

    private CardView coc2content1,coc2content2,coc2content3,coc2content4;

    private FloatingActionButton fab;

    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc2activity);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        coc2content1 = (CardView) findViewById(R.id.coc2content1);
        coc2content2 = (CardView) findViewById(R.id.coc2content2);
        coc2content3 = (CardView) findViewById(R.id.coc2content3);
        coc2content4 = (CardView) findViewById(R.id.coc2content4);

        fab = findViewById(R.id.coc2backbutton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc2activity.this,coc.class);
                startActivity(intent);
            }
        });

        coc2content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc2activity.this,coc2content1.class);
                startActivity(intent);
            }
        });

        coc2content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc2activity.this,coc2content2.class);
                startActivity(intent);
            }
        });
        coc2content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc2activity.this,coc2content3.class);
                startActivity(intent);
            }
        });
        coc2content4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc2activity.this,coc2content4.class);
                startActivity(intent);
            }
        });
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