package com.software.silentprayer.Hadeesfull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.software.silentprayer.R;
import com.software.silentprayer.sunanibnemaja.sunanibnvol_five;
import com.software.silentprayer.sunanibnemaja.sunanibnvol_four;
import com.software.silentprayer.sunanibnemaja.sunanibnvol_one;
import com.software.silentprayer.sunanibnemaja.sunanibnvol_three;
import com.software.silentprayer.sunanibnemaja.sunanibnvol_two;
import com.software.silentprayer.sunannisae.sunannasaivol_five;
import com.software.silentprayer.sunannisae.sunannasaivol_four;
import com.software.silentprayer.sunannisae.sunannasaivol_one;
import com.software.silentprayer.sunannisae.sunannasaivol_three;
import com.software.silentprayer.sunannisae.sunannasaivol_two;

public class hadeessix extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeessix);

        card1 = findViewById(R.id.cardView1);
        card2 = findViewById(R.id.cardView2);
        card3 = findViewById(R.id.cardView3);
        card4 = findViewById(R.id.cardView4);
        card5 = findViewById(R.id.cardView5);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeessix.this, sunanibnvol_one.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeessix.this, sunanibnvol_two.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeessix.this, sunanibnvol_three.class);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeessix.this, sunanibnvol_four.class);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeessix.this, sunanibnvol_five.class);
                startActivity(intent);
            }
        });


    }
}