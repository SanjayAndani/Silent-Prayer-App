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
import com.software.silentprayer.sunanabudaood.sunanvol_four;
import com.software.silentprayer.sunanabudaood.sunanvol_one;
import com.software.silentprayer.sunanabudaood.sunanvol_three;
import com.software.silentprayer.sunanabudaood.sunanvol_two;
import com.software.silentprayer.sunanibnemaja.sunanibnvol_one;

public class hadeesfour extends AppCompatActivity {

    CardView card1, card2, card3, card4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeesfour);

        card1 = findViewById(R.id.cardView1);
        card2 = findViewById(R.id.cardView2);
        card3 = findViewById(R.id.cardView3);
        card4 = findViewById(R.id.cardView4);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfour.this, sunanvol_one.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfour.this, sunanvol_two.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfour.this, sunanvol_three.class);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesfour.this, sunanvol_four.class);
                startActivity(intent);
            }
        });
    }
}