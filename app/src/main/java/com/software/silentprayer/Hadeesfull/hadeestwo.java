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
import com.software.silentprayer.sahimuslim.Muslim1;
import com.software.silentprayer.sahimuslim.Muslim2;
import com.software.silentprayer.sahimuslim.Muslim3;
import com.software.silentprayer.sahimuslim.Muslim4;
import com.software.silentprayer.sahimuslim.Muslim5;
import com.software.silentprayer.sahimuslim.Muslim6;

public class hadeestwo extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5, card6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeestwo);

        card1 = findViewById(R.id.cardView1);
        card2 = findViewById(R.id.cardView2);
        card3 = findViewById(R.id.cardView3);
        card4 = findViewById(R.id.cardView4);
        card5 = findViewById(R.id.cardView5);
        card6 = findViewById(R.id.cardView6);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeestwo.this, Muslim1.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeestwo.this, Muslim2.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeestwo.this, Muslim3.class);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeestwo.this, Muslim4.class);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeestwo.this, Muslim5.class);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeestwo.this, Muslim6.class);
                startActivity(intent);
            }
        });



    }
}