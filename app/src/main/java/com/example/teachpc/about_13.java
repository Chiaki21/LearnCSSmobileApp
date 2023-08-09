package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class about_13 extends YouTubeBaseActivity {

    private ImageView imagebutton,imagebutton1,imagebutton2,imagebutton3,imagebutton4,imagebutton5;

    public static final String KEY2 = "photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about13);
        getWindow().setStatusBarColor(ContextCompat.getColor(about_13.this,R.color.gray));


        imagebutton = findViewById(R.id.chartt1);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_13.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.chart1);
                startActivity(intent);
            }
        });
        imagebutton1 = findViewById(R.id.chartt2);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_13.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.chart2);
                startActivity(intent);
            }
        });
        imagebutton2 = findViewById(R.id.chartt3);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_13.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.chart3);
                startActivity(intent);
            }
        });
        imagebutton3 = findViewById(R.id.chartt4);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_13.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.chart4);
                startActivity(intent);
            }
        });
        imagebutton4 = findViewById(R.id.chartt5);
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_13.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.chart5);
                startActivity(intent);
            }
        });
        imagebutton5 = findViewById(R.id.chartt6);
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_13.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.chart6);
                startActivity(intent);
            }
        });
    }
}