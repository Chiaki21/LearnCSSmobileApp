package com.example.teachpc;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import com.google.firebase.auth.FirebaseAuth;




public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    AlertDialog.Builder builder;

    public CardView card1,card2,card3,card4,card5,card6;
    private ImageView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        getWindow().setStatusBarColor(ContextCompat.getColor(HomeActivity.this,R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        card1 = (CardView) findViewById(R.id.pcparts);
        card2 = (CardView) findViewById(R.id.aboutpc);
        card3 = (CardView) findViewById(R.id.quizzes);
        card4 = (CardView) findViewById(R.id.tutorials);
        card5 = (CardView) findViewById(R.id.coc);
        card6 = (CardView) findViewById(R.id.detector);


        logout = (ImageView) findViewById(R.id.signOut);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

        logout = (ImageView) findViewById(R.id.signOut);

        builder = new AlertDialog.Builder(this);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.tensorflow.lite.examples.objectdetection");
                if(launchIntent != null){
                    startActivity(launchIntent);
                } else{
                    builder.setTitle("External file need to open detector!")
                            .setMessage("Install external file?")
                            .setCancelable(true)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    gotoUrl("https://drive.google.com/uc?export=download&id=1v9jDok-1EXlOBfGatdGwk8rkLdOwAJlA");
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            }).show();
                }
            }
        });


        builder = new AlertDialog.Builder(this);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("Log Out")
                        .setMessage("You sure you want to log out?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                FirebaseAuth.getInstance().signOut();
                                SharedPreferences sharedPreferences = getSharedPreferences(LoginUser.PREFS_NAME, 0);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putBoolean("hasLoggedIn", false);
                                editor.commit();
                                startActivity(new Intent(HomeActivity.this, LoginUser.class));
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }).show();
            }
        });


    }

    @Override
    public void onBackPressed () {
    }
    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.pcparts:
                i = new Intent(this,PCParts.class);
                startActivity(i);
                break;

            case R.id.aboutpc:
                i = new Intent(this,AboutPC.class);
                startActivity(i);
                break;

            case R.id.quizzes:
                Toast.makeText(HomeActivity.this,"Need to Login first to access",Toast.LENGTH_SHORT).show();
                break;

            case R.id.tutorials:
                Toast.makeText(HomeActivity.this,"Need to Login first to access",Toast.LENGTH_SHORT).show();
                break;

            case R.id.coc:
                Toast.makeText(HomeActivity.this,"Need to Login first to access",Toast.LENGTH_SHORT).show();
                break;




        }

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}