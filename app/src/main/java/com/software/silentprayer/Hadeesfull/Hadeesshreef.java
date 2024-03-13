package com.software.silentprayer.Hadeesfull;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.software.silentprayer.ImageAdapter;
import com.software.silentprayer.R;

public class Hadeesshreef extends AppCompatActivity {

    private int[] imageResources = {
            R.drawable.hadeesone,
            R.drawable.hadeestwo,
            R.drawable.hadeesthird,
            R.drawable.hadeesfourth,
            R.drawable.hadeesfifth,
            R.drawable.hadeessixth,
            // Add more image resource IDs here
    };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeesshreef);

        GridView gridView = findViewById(R.id.gridView);
        ImageAdapter adapter = new ImageAdapter(this, imageResources);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Open different activities based on grid item clicks
                switch (position) {
                    case 0:
                        startActivity(new Intent(Hadeesshreef.this, hadeesone.class));
                        break;
                    case 1:
                        startActivity(new Intent(Hadeesshreef.this, hadeestwo.class));
                        break;
                    case 2:
                        startActivity(new Intent(Hadeesshreef.this, hadeesthree.class));
                        break;
                    case 3:
                        startActivity(new Intent(Hadeesshreef.this, hadeesfour.class));
                        break;
                    case 4:
                        startActivity(new Intent(Hadeesshreef.this, hadeesfifth.class));
                        break;
                    case 5:
                        startActivity(new Intent(Hadeesshreef.this, hadeessix.class));
                        break;
                    // Add more cases for each grid item
                    default:
                        break;
                }
            }
        });




    }
}