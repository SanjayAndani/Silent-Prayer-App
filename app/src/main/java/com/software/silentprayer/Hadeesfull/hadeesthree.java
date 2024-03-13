package com.software.silentprayer.Hadeesfull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.software.silentprayer.Jamatirmizi.jamavol_one_removed;
import com.software.silentprayer.Jamatirmizi.jamavol_two_removed;
import com.software.silentprayer.R;
import com.software.silentprayer.sahibukhari.Vol1;
import com.software.silentprayer.sahibukhari.Vol2;

public class hadeesthree extends AppCompatActivity {
    CardView card1, card2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeesthree);

        card1 = findViewById(R.id.cardView1);
        card2 = findViewById(R.id.cardView2);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesthree.this, jamavol_one_removed.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hadeesthree.this, jamavol_two_removed.class);
                startActivity(intent);
            }
        });
    }
}