package com.example.teachpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teachpc.Utility.NetworkChangeListener;

import java.sql.Array;
import java.text.CollationElementIterator;
import java.util.ArrayList;

public class PCParts extends AppCompatActivity {



    ListView listView;



    String[] mTitle = {"Motherboard","Central Processing Unit(CPU)",
            "Power Supply Unit","Cooling Fan","Random Access Memory","Graphics Card","Hard Disk Drive(HDD)",
            "Solid-State Drive(SSD)","Optical Disc drive","Card Reader","Monitor","Keyboard",
            "Mouse","Speaker and Headphone","Sound Card","Network Interface Card",
            "Desktop Case","Touchpad","Expansion Card","Laptop Charger"};

    int images[] = {R.drawable.motherboard,R.drawable.cpu,R.drawable.psu,R.drawable.coolingfan,R.drawable.ram,
            R.drawable.graphicscard,R.drawable.hdd,R.drawable.ssd,R.drawable.discdrive,R.drawable.cardreader,R.drawable.monitor,
            R.drawable.keyboard,R.drawable.mouse,R.drawable.speakers,R.drawable.soundcard,R.drawable.nic,
            R.drawable.desktopcase,R.drawable.touchpad,R.drawable.expansioncard,R.drawable.laptopcharger};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcparts);

        getWindow().setStatusBarColor(ContextCompat.getColor(PCParts.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("PC Parts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }


        listView = findViewById(R.id.listView);


        MyAdapter adapter = new MyAdapter(this,mTitle,images);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(),part_Motherboard.class);
                    startActivity(intent);
                }
                if (position == 1 ) {
                    Intent intent = new Intent(getApplicationContext(),part_CPU.class);
                    startActivity(intent);
                }
                if (position == 2 ) {
                    Intent intent = new Intent(getApplicationContext(),part_PSU.class);
                    startActivity(intent);
                }
                if (position == 3 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Fan.class);
                    startActivity(intent);
                }
                if (position == 4 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Ram.class);
                    startActivity(intent);
                }
                if (position == 5 ) {
                    Intent intent = new Intent(getApplicationContext(),part_GPU.class);
                    startActivity(intent);
                }
                if (position == 6 ) {
                    Intent intent = new Intent(getApplicationContext(),part_HDD.class);
                    startActivity(intent);
                }
                if (position == 7 ) {
                    Intent intent = new Intent(getApplicationContext(),part_SSD.class);
                    startActivity(intent);
                }
                if (position == 8 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Discdrive.class);
                    startActivity(intent);
                }
                if (position == 9 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Cardreader.class);
                    startActivity(intent);
                }
                if (position == 10 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Monitor.class);
                    startActivity(intent);
                }
                if (position == 11 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Keyboard.class);
                    startActivity(intent);
                }
                if (position == 12 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Mouse.class);
                    startActivity(intent);
                }
                if (position == 13 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Speaker.class);
                    startActivity(intent);
                }
                if (position == 14 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Soundcard.class);
                    startActivity(intent);
                }
                if (position == 15 ) {
                    Intent intent = new Intent(getApplicationContext(),part_NIC.class);
                    startActivity(intent);
                }
                if (position == 16 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Case.class);
                    startActivity(intent);
                }
                if (position == 17 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Touchpad.class);
                    startActivity(intent);
                }
                if (position == 18 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Expansioncard.class);
                    startActivity(intent);
                }
                if (position == 19 ) {
                    Intent intent = new Intent(getApplicationContext(),part_Laptopcharger.class);
                    startActivity(intent);
                }


            }
        });
    }


    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        int rImgs[];

        MyAdapter (Context c,String title[],int imgs[]) {
            super (c,R.layout.row,R.id.textView1,title);
            this.context = c;
            this.rTitle = title;
            this.rImgs = imgs;

        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);

            return row;
        }
    }

    }

