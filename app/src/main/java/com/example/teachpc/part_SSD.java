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

public class part_SSD extends AppCompatActivity {

    private ImageView imagebutton;
    private TextView textView;

    public static final String KEY2 = "photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_ssd);

        getWindow().setStatusBarColor(ContextCompat.getColor(part_SSD.this,R.color.gray));
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton ssdbutton = findViewById(R.id.ssdviewer);
        ssdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
                sceneViewerIntent.setData(Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/Chiaki21/3dviewer/main/ssd/scene.gltf"));
                sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox");
                startActivity(sceneViewerIntent);
            }
        });

        imagebutton = findViewById(R.id.idssd);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_SSD.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.ssd1);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.twoinch);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_SSD.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.twoinch);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.msata);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_SSD.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.msata);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.mtwo);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_SSD.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.mtwo);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.pcie);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_SSD.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.pcie);
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
                gotoUrl("https://www.lazada.com.ph/catalog/?q=ssd&_keyori=ss&from=input&spm=a2o4l.searchlist.search.go.7643410bHUtlUr");
                return true;
            case R.id.item3:
                gotoUrl("https://shopee.ph/search?keyword=ssd");
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