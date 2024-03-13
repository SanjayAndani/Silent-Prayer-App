package com.software.silentprayer;
import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class qbladirection extends Activity implements SensorEventListener {

    private ImageView compassImageView;
    private TextView degreeTextView;
    private SensorManager sensorManager;
    private Sensor accelerometerSensor;
    private Sensor magnetometerSensor;

    private float[] accelerometerReading = new float[3];
    private float[] magnetometerReading = new float[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qbladirection);

        compassImageView = findViewById(R.id.compassImageView);
        degreeTextView = findViewById(R.id.degreeTextView);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        magnetometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor == accelerometerSensor) {
            System.arraycopy(event.values, 0, accelerometerReading, 0, accelerometerReading.length);
        } else if (event.sensor == magnetometerSensor) {
            System.arraycopy(event.values, 0, magnetometerReading, 0, magnetometerReading.length);
        }

        float[] rotationMatrix = new float[9];
        if (SensorManager.getRotationMatrix(rotationMatrix, null, accelerometerReading, magnetometerReading)) {
            float[] orientation = new float[3];
            SensorManager.getOrientation(rotationMatrix, orientation);
            float degrees = (float) Math.toDegrees(orientation[0]);

            // Adjust the degree to the range [0, 360]
            degrees = (degrees + 360) % 360;

            degreeTextView.setText(String.format("%.1f°", degrees));
            compassImageView.setRotation(-degrees);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, accelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(this, magnetometerSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }
}