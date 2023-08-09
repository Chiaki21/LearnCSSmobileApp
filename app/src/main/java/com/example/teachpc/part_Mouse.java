package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class part_Mouse extends AppCompatActivity {

    private ImageView imagebutton;
    private TextView textView;

    public static final String KEY2 = "photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_mouse);

        getWindow().setStatusBarColor(ContextCompat.getColor(part_Mouse.this,R.color.gray));
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }
        final AppCompatButton mousebutton = findViewById(R.id.mouseviewer);
        mousebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
                sceneViewerIntent.setData(Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/Chiaki21/3dviewer/main/mouse/scene.gltf"));
                sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox");
                startActivity(sceneViewerIntent);
            }
        });


        imagebutton = findViewById(R.id.idmouse);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.mouse1);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.airmouse);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.airmouse);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cordless);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cordless);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.footmouse);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.footmouse);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.intellimouse);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.intellimouse);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.jmousae);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.jmouse);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.joystick);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.joystick);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.mechanical);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.mechanical);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.optical);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.optical);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.touchpad);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.touchpad1);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.trackball);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.trackball);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.trackpoint);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Mouse.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.trackpoint);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item2:
                gotoUrl("https://www.lazada.com.ph/catalog/?q=mouse&_keyori=ss&from=input&spm=a2o4l.searchlist.search.go.1c9f58533IbF43");
                return true;
            case R.id.item3:
                gotoUrl("https://shopee.ph/search?keyword=mouse");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}