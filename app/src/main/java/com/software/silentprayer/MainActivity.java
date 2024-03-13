package com.software.silentprayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

import com.software.silentprayer.Hadeesfull.Hadeesshreef;
import com.software.silentprayer.autosilent.autosilent;


public class MainActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;
//    private static final int FLIP_INTERVAL = 2000; // Interval between image flips in milliseconds


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.viewFlipper);

        // Start the flipper
        viewFlipper.startFlipping();

//        // Set an animation for the view flipper (optional)
//        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
//        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
//
//
//        // Start the flipper
//        viewFlipper.setAutoStart(true);
//        viewFlipper.setFlipInterval(FLIP_INTERVAL);
//        viewFlipper.startFlipping();
//
//        // Optional: Pause and resume flipper on touch
//        viewFlipper.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, android.view.MotionEvent event) {
//                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
//                    viewFlipper.stopFlipping();
//                }
//                if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
//                    viewFlipper.startFlipping();
//                }
//                return true;
//            }
//        });




    }
    public void openfirstActivity(View view) {
        Intent intent = new Intent(this, autosilent.class);
        startActivity(intent);
    }
    public void opensecondActivity(View view) {
        Intent intent = new Intent(this, readquran.class);
        startActivity(intent);
    }

    public void openthirdActivity(View view) {
        Intent intent = new Intent(this, Hadeesshreef.class);
        startActivity(intent);
    }

    public void openforthActivity(View view) {
        Intent intent = new Intent(this, SeeratNabi.class);
        startActivity(intent);
    }

    public void openfifthActivity(View view) {
        Intent intent = new Intent(this, tasbi.class);
        startActivity(intent);
    }

    public void opensixActivity(View view) {
        Intent intent = new Intent(this,qbladirection.class);
        startActivity(intent);
    }
    public void opensevenActivity(View view) {
        Intent intent = new Intent(this,kalmas.class);
        startActivity(intent);
    }


    }
