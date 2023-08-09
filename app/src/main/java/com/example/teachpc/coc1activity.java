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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.teachpc.Utility.NetworkChangeListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class coc1activity extends AppCompatActivity {

    private TextView textView;

    private FloatingActionButton fab;
    private CardView coc1content1,coc1content1_1,coc1content2,coc1content3,coc1content4,coc1content5;

    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc1activity);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        coc1content1 = (CardView) findViewById(R.id.coc1content1);
        coc1content1_1 = (CardView) findViewById(R.id.coc1content1_1);
        coc1content2 = (CardView) findViewById(R.id.coc1content2);
        coc1content3 = (CardView) findViewById(R.id.coc1content3);
        coc1content4 = (CardView) findViewById(R.id.coc1content4);
        coc1content5 = (CardView) findViewById(R.id.coc1content5);

        textView = findViewById(R.id.coc1seeparts);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,PCParts.class);
                startActivity(intent);
            }
        });

        fab = findViewById(R.id.coc1backbutton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,coc.class);
                startActivity(intent);
            }
        });


        coc1content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,coc1content1.class);
                startActivity(intent);

            }
        });

        coc1content1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,coc1content1_1.class);
                startActivity(intent);
            }
        });

        coc1content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,coc1content2.class);
                startActivity(intent);

            }
        });

        coc1content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,coc1content3.class);
                startActivity(intent);

            }
        });

        coc1content4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,coc1content4.class);
                startActivity(intent);

            }
        });

        coc1content5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coc1activity.this,coc1content5.class);
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