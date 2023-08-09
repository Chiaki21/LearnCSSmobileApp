package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
//import android.provider.CalendarContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        getWindow().setStatusBarColor(ContextCompat.getColor(AboutUs.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }
        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.teachpclogo200)
                .setDescription("\"TeachPC\" is a mobile E-Learning app that aims to help everyone especially the course Bachelor of Science in Information Technology\n" +
                        "and Computer Science and any other related field to learn about computer parts and its specific fundamentals.\n\n" +
                        "This app came out from the Research Title of \"ANDROID BASE E-LEARNING FOR COMPUTER PARTS AND FUNDAMENTALS\"\n" +
                        "to represent to the Faculty of Eulogio “Amang” Rodriguez Institute of Science and Technology (Cavite Campus) 2022.\n\n\nResearchers:\n\nLuzano Justine M.\n\nUgas Stephanie\n\nRyan Rebucas\n\nManansala Patrick Simon\n\nMananzala Vhong\n\nFrancisco JL")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("CONNECT WITH US!")
                .addEmail("luzano.justine.eccinfotech@gmail.com")
                .addFacebook("justineflame322","Luzano Justine M.")
                .addFacebook("Babi91319","Ugas Stephanie")
                .addFacebook("Ryanrebucas02","Rebucas Ryan")
                .addFacebook("100077965006702","Manansala Patrick Simon")
                .addFacebook("vmc1412","Manzano Vhong")
                .addFacebook("Bessfriends","Francisco JL")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by TeachPC(Thesis)", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutUs.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}