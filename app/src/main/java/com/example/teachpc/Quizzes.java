package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.teachpc.Utility.NetworkChangeListener;

public class Quizzes extends AppCompatActivity {

    AlertDialog.Builder builder;

    private String selectedTopicName = "";

    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        getWindow().setStatusBarColor(ContextCompat.getColor(Quizzes.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("Quizzes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
    }

        final LinearLayout coc_category1 = findViewById(R.id.coc_category1);
        final LinearLayout coc_category2 = findViewById(R.id.coc_category2);
        final LinearLayout coc_category3 = findViewById(R.id.coc_category3);
        final LinearLayout coc_category4 = findViewById(R.id.coc_category4);

        final LinearLayout category1 = findViewById(R.id.category1);
        final LinearLayout category2 = findViewById(R.id.category2);
        final LinearLayout category3 = findViewById(R.id.category3);
        final LinearLayout category4 = findViewById(R.id.category4);
        final LinearLayout category5 = findViewById(R.id.category5);
        final LinearLayout category6 = findViewById(R.id.category6);



        builder = new AlertDialog.Builder(this);

        coc_category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("COC 1")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Install and Configure\nComputer Systems";


                                Intent intent = new Intent(Quizzes.this, coc1quiz.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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

        coc_category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("COC 2")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Set-up Computer\nNetworks";


                                Intent intent = new Intent(Quizzes.this, coc2quiz.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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

        coc_category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("COC 3")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Set-up Computer\nServers";


                                Intent intent = new Intent(Quizzes.this, coc3quiz.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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

        coc_category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("COC 4")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Maintain and Repair\nComputer Systems\nand Networks";

                                Intent intent = new Intent(Quizzes.this, coc4quiz.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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


        // EXTRA QUIZZES

        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setTitle("History Of Computer")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "History Of Computers";
                                category1.setBackgroundResource(R.drawable.round_back_white_stroke10);

                                category2.setBackgroundResource(R.drawable.round_back_white10);
                                category3.setBackgroundResource(R.drawable.round_back_white10);
                                category4.setBackgroundResource(R.drawable.round_back_white10);
                                category5.setBackgroundResource(R.drawable.round_back_white10);
                                category6.setBackgroundResource(R.drawable.round_back_white10);

                                Intent intent = new Intent(Quizzes.this, QuizActivity.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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

        category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setTitle("Computer Info")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Computer Info";
                                category2.setBackgroundResource(R.drawable.round_back_white_stroke10);

                                category1.setBackgroundResource(R.drawable.round_back_white10);
                                category3.setBackgroundResource(R.drawable.round_back_white10);
                                category4.setBackgroundResource(R.drawable.round_back_white10);
                                category5.setBackgroundResource(R.drawable.round_back_white10);
                                category6.setBackgroundResource(R.drawable.round_back_white10);



                                Intent intent = new Intent(Quizzes.this, QuizActivity.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);

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

        category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setTitle("Fundamentals")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Fundamentals";
                                category3.setBackgroundResource(R.drawable.round_back_white_stroke10);

                                category2.setBackgroundResource(R.drawable.round_back_white10);
                                category1.setBackgroundResource(R.drawable.round_back_white10);
                                category4.setBackgroundResource(R.drawable.round_back_white10);
                                category5.setBackgroundResource(R.drawable.round_back_white10);
                                category6.setBackgroundResource(R.drawable.round_back_white10);



                                Intent intent = new Intent(Quizzes.this, QuizActivity.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);


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

        category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setTitle("History Set 2")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "History Set 2";
                                category4.setBackgroundResource(R.drawable.round_back_white_stroke10);

                                category2.setBackgroundResource(R.drawable.round_back_white10);
                                category3.setBackgroundResource(R.drawable.round_back_white10);
                                category1.setBackgroundResource(R.drawable.round_back_white10);
                                category5.setBackgroundResource(R.drawable.round_back_white10);
                                category6.setBackgroundResource(R.drawable.round_back_white10);


                                Intent intent = new Intent(Quizzes.this, QuizActivity.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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

        category5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                builder.setTitle("Components Of Computer")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Components";
                                category5.setBackgroundResource(R.drawable.round_back_white_stroke10);

                                category2.setBackgroundResource(R.drawable.round_back_white10);
                                category3.setBackgroundResource(R.drawable.round_back_white10);
                                category4.setBackgroundResource(R.drawable.round_back_white10);
                                category1.setBackgroundResource(R.drawable.round_back_white10);
                                category6.setBackgroundResource(R.drawable.round_back_white10);


                                Intent intent = new Intent(Quizzes.this, QuizActivity.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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

        category6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setTitle("Computer Hardware")
                        .setMessage("You want to start the quiz?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                selectedTopicName = "Computer Hardware";
                                category6.setBackgroundResource(R.drawable.round_back_white_stroke10);

                                category2.setBackgroundResource(R.drawable.round_back_white10);
                                category3.setBackgroundResource(R.drawable.round_back_white10);
                                category4.setBackgroundResource(R.drawable.round_back_white10);
                                category5.setBackgroundResource(R.drawable.round_back_white10);
                                category1.setBackgroundResource(R.drawable.round_back_white10);



                                Intent intent = new Intent(Quizzes.this, QuizActivity.class);
                                intent.putExtra("selectedTopic",selectedTopicName);
                                startActivity(intent);
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



}@Override
    public void onBackPressed () {
        startActivity(new Intent(Quizzes.this, userHome.class));
        finish();
    }
    @Override
    protected void onStart(){
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeListener, filter);
        super.onStart();
    }

    @Override
    protected void onStop(){
        unregisterReceiver(networkChangeListener);
        super.onStop();
    }
}