package com.software.silentprayer.autosilent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.software.silentprayer.R;
import com.software.silentprayer.autosilent.Asar.Asar;
import com.software.silentprayer.autosilent.Fajar.Fajar;
import com.software.silentprayer.autosilent.Isha.Isha;
import com.software.silentprayer.autosilent.Jumma.Jumma;
import com.software.silentprayer.autosilent.Magrib.Magrib;
import com.software.silentprayer.autosilent.Zuhar.Zuhar;

public class autosilent extends AppCompatActivity {


    CardView card1, card2, card3, card4, card5, card6;
    ImageView img1, img2, img3, img4, img5, img6;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autosilent);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);













        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(autosilent.this, Fajar.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(autosilent.this, Zuhar.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(autosilent.this, Asar.class);
                startActivity(intent);
            }
        });
//
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(autosilent.this, Magrib.class);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(autosilent.this, Isha.class);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(autosilent.this, Jumma.class);
                startActivity(intent);
            }
        });



    }
}