package com.software.silentprayer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class tasbi extends AppCompatActivity {

    private TextView tasbihCountTextView;
    private EditText countLimitEditText;
    private Button incrementButton, resetButton;
    private int tasbihCount = 0;
    private int countLimit = 0;
    private Vibrator vibrator;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbi);

        tasbihCountTextView = findViewById(R.id.tasbihCountTextView);
        countLimitEditText = findViewById(R.id.countLimitEditText);
        incrementButton = findViewById(R.id.incrementButton);
        resetButton = findViewById(R.id.resetButton);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementTasbihCount();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTasbihCount();
            }
        });
    }

    private void incrementTasbihCount() {
        // Retrieve the user-defined count limit
        String limitStr = countLimitEditText.getText().toString();

        if (!limitStr.isEmpty()) {
            countLimit = Integer.parseInt(limitStr);
        } else {
            Toast.makeText(tasbi.this, "Please enter a valid limit", Toast.LENGTH_SHORT).show();
            return;
        }

        if (tasbihCount < countLimit) {
            tasbihCount++;
            tasbihCountTextView.setText(String.valueOf(tasbihCount));
        } else {
            Toast.makeText(tasbi.this, "Count limit reached", Toast.LENGTH_SHORT).show();
        }
    }
//

//        if (tasbihCount < countLimit) {
//            tasbihCount++;
//            tasbihCountTextView.setText(String.valueOf(tasbihCount));
//
//            // Check if the count is a multiple of 33 to trigger vibration feedback
//            if (tasbihCount % 33 == 0) {
//                vibrateDevice();
//            }
//        } else {
//            // When the count limit is reached, show a message or perform an action
//             //For example:
//             Toast.makeText(this, "Count limit reached!", Toast.LENGTH_SHORT).show();
//        }
//    }

    private void resetTasbihCount() {
        tasbihCount = 0;
        tasbihCountTextView.setText(String.valueOf(tasbihCount));
    }

    private void vibrateDevice() {
        if (vibrator != null) {
            vibrator.vibrate(300); // Vibrate for 300 milliseconds
        }
    }
}