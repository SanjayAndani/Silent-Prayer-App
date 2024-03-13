package com.software.silentprayer.Hadeesfull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.software.silentprayer.R;
import com.software.silentprayer.sahibukhari.Vol1;
import com.software.silentprayer.sahibukhari.Vol2;
import com.software.silentprayer.sahibukhari.Vol3;
import com.software.silentprayer.sahibukhari.Vol4;
import com.software.silentprayer.sahibukhari.Vol5;
import com.software.silentprayer.sahibukhari.Vol6;
import com.software.silentprayer.sahibukhari.Vol7;
import com.software.silentprayer.sahibukhari.Vol8;


public class hadeesone extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5, card6, card7, card8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeesone);

        card1 = findViewById(R.id.cardView1);
        card2 = findViewById(R.id.cardView2);
        card3 = findViewById(R.id.cardView3);
        card4 = findViewById(R.id.cardView4);
        card5 = findViewById(R.id.cardView5);
        card6 = findViewById(R.id.cardView6);
        card7 = findViewById(R.id.cardView7);
        card8 = findViewById(R.id.cardView8);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol1.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol2.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol3.class);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol4.class);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol5.class);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol6.class);
                startActivity(intent);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol7.class);
                startActivity(intent);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesone.this, Vol8.class);
                startActivity(intent);
            }
        });




    }
}