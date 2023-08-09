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

public class part_Fan extends AppCompatActivity {

    private ImageView imagebutton;
    private TextView textView;

    public static final String KEY2 = "photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_fan);

        getWindow().setStatusBarColor(ContextCompat.getColor(part_Fan.this,R.color.gray));
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton fanbutton = findViewById(R.id.fanviewer);
        fanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
                sceneViewerIntent.setData(Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/Chiaki21/3dviewer/main/fan/scene.gltf"));
                sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox");
                startActivity(sceneViewerIntent);
            }
        });

        imagebutton = findViewById(R.id.idfan);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Fan.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.coolingfan1);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.casefan);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Fan.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.casefan);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cpufan);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Fan.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cpufan);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.psufan);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Fan.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.psufan);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.vcardfan);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Fan.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.vcardfan);
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
                gotoUrl("https://www.lazada.com.ph/catalog/?q=computer+fan&_keyori=ss&from=input&spm=a2o4l.searchlist.search.go.28ad56d2SoqmM5");
                return true;
            case R.id.item3:
                gotoUrl("https://shopee.ph/search?keyword=computer%20fan");
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