package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class about_12 extends YouTubeBaseActivity {

    private ImageView imagebutton;

    public static final String KEY2 = "photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about12);
        getWindow().setStatusBarColor(ContextCompat.getColor(about_12.this,R.color.gray));

        imagebutton = findViewById(R.id.laptopmotherboardview);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_12.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.laptopmotherboard2);
                startActivity(intent);
            }
        });
    }


}