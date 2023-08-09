package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class about_15 extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about15);

        getWindow().setStatusBarColor(ContextCompat.getColor(about_15.this,R.color.gray));
    }
}