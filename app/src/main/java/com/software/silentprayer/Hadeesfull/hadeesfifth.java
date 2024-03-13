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
import com.software.silentprayer.sunannisae.sunannasaivol_five;
import com.software.silentprayer.sunannisae.sunannasaivol_four;
import com.software.silentprayer.sunannisae.sunannasaivol_one;
import com.software.silentprayer.sunannisae.sunannasaivol_seven;
import com.software.silentprayer.sunannisae.sunannasaivol_six;
import com.software.silentprayer.sunannisae.sunannasaivol_three;
import com.software.silentprayer.sunannisae.sunannasaivol_two;

public class hadeesfifth extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5, card6, card7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeesfifth);

        card1 = findViewById(R.id.cardView1);
        card2 = findViewById(R.id.cardView2);
        card3 = findViewById(R.id.cardView3);
        card4 = findViewById(R.id.cardView4);
        card5 = findViewById(R.id.cardView5);
        card6 = findViewById(R.id.cardView6);
        card7 = findViewById(R.id.cardView7);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfifth.this, sunannasaivol_one.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfifth.this, sunannasaivol_two.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfifth.this, sunannasaivol_three.class);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfifth.this, sunannasaivol_four.class);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfifth.this, sunannasaivol_five.class);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfifth.this, sunannasaivol_six.class);
                startActivity(intent);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfifth.this, sunannasaivol_seven.class);
                startActivity(intent);
            }
        });

    }
}