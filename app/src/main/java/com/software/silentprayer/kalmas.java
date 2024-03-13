package com.software.silentprayer;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.software.silentprayer.Images.Image1;
import com.software.silentprayer.Images.Image2;
import com.software.silentprayer.Images.Image3;
import com.software.silentprayer.Images.Image4;
import com.software.silentprayer.Images.Image5;
import com.software.silentprayer.Images.Image6;

public class kalmas extends AppCompatActivity {

    private int[] imageResources = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            // Add more image resource IDs here
    };








    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalmas);

        GridView gridView = findViewById(R.id.gridView);
        ImageAdapter adapter = new ImageAdapter(this, imageResources);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Open different activities based on grid item clicks
                switch (position) {
                    case 0:
                        startActivity(new Intent(kalmas.this, Image1.class));
                        break;
                    case 1:
                        startActivity(new Intent(kalmas.this, Image2.class));
                        break;
                    case 2:
                        startActivity(new Intent(kalmas.this, Image3.class));
                        break;
                    case 3:
                        startActivity(new Intent(kalmas.this, Image4.class));
                        break;
                    case 4:
                        startActivity(new Intent(kalmas.this, Image5.class));
                        break;
                    case 5:
                        startActivity(new Intent(kalmas.this, Image6.class));
                        break;
                    // Add more cases for each grid item
                    default:
                        break;
                }
            }
        });




    }
}
