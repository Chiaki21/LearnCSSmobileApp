package com.example.teachpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class part_Motherboard extends AppCompatActivity {

    private TextView textView;

    private ImageView imagebutton;

    public static final String KEY2 = "photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_motherboard);

        getWindow().setStatusBarColor(ContextCompat.getColor(part_Motherboard.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton motherboardbutton = findViewById(R.id.motherboardviewer);
        motherboardbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
                sceneViewerIntent.setData(Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/Chiaki21/3dviewer/main/motherboard/scene.gltf"));
                sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox");
                startActivity(sceneViewerIntent);
            }
        });
        imagebutton = findViewById(R.id.idmotherboard);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.motherboard1);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.expansion);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.expansionslot);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.pincase);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.pincase);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.heatsink);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.heatsink);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.pinpower);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.pinpower);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.inductor);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.inductor);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.capacitor);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.capacitors);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cpusocket);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cpusocket);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.northbridge);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.northbridge);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.screwhole);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.screwhole);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.memoryslot);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.memoryslot);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.superio);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.superio);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.ataide);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.ataide);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.psuconnector);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.psuconnector);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.serialata);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.serialata);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.coincell);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.coincell);
                startActivity(intent);
            }
        });


        textView = findViewById(R.id.systempanel);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.systempanel);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.fwh);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.fwh);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.southbridge);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.southbridge);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.serialport);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.serialport);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.usbheaders);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.usbheader);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.jumpers);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.jumper);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.integratedcircuit);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.integratedcircuit);
                startActivity(intent);
            }
        });


        textView = findViewById(R.id.spdif);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.spdif);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cdin);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Motherboard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cdin);
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
                gotoUrl("https://www.lazada.com.ph/catalog/?q=motherboard&_keyori=ss&from=input&spm=a2o4l.home.search.go.6896359dzbjqQn");
                return true;
            case R.id.item3:
                gotoUrl("https://shopee.ph/search?keyword=motherboard");
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