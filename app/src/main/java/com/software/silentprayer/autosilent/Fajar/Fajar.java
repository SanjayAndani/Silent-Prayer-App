package com.software.silentprayer.autosilent.Fajar;


import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.software.silentprayer.R;

import java.util.Calendar;

public class Fajar extends AppCompatActivity {

    private TimePicker startTimePicker;
    private TimePicker endTimePicker;
    private Button setButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fajar);

        startTimePicker = findViewById(R.id.startTimePicker);
        endTimePicker = findViewById(R.id.endTimePicker);
        setButton = findViewById(R.id.setButton);

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int startHour = startTimePicker.getHour();
                int startMinute = startTimePicker.getMinute();
                int endHour = endTimePicker.getHour();
                int endMinute = endTimePicker.getMinute();

                // Get the current time
                Calendar currentTime = Calendar.getInstance();
                int currentHour = currentTime.get(Calendar.HOUR_OF_DAY);
                int currentMinute = currentTime.get(Calendar.MINUTE);

                // Check if the starting time is in the future
                if (startHour < currentHour || (startHour == currentHour && startMinute < currentMinute)) {
                    Toast.makeText(Fajar.this, "Please select a future starting time.", Toast.LENGTH_SHORT).show();
                } else {
                    // Schedule the alarm to switch to vibration mode at the starting time
                    scheduleVibrationMode(startHour, startMinute);

                    // Schedule the alarm to switch back to normal ringing mode at the ending time
                    scheduleNormalMode(endHour, endMinute);

                    // Display a toast message
                    Toast.makeText(Fajar.this, "Fajar Time Set", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void scheduleVibrationMode(int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        // Get the AlarmManager
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        // Create an Intent to trigger the vibration mode
        Intent intent = new Intent(Fajar.this, VibrationService.class);
        PendingIntent pendingIntent = PendingIntent.getService(Fajar.this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        // Schedule the alarm to trigger at the specified starting time
        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
    }

    private void scheduleNormalMode(int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        // Get the AlarmManager
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        // Create an Intent to trigger the normal ringing mode
        Intent intent = new Intent(Fajar.this, NormalModeService.class);
        PendingIntent pendingIntent = PendingIntent.getService(Fajar.this, 1, intent, PendingIntent.FLAG_IMMUTABLE);

        // Schedule the alarm to trigger at the specified ending time
        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
    }
}