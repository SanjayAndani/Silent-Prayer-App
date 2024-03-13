package com.software.silentprayer.autosilent.Zuhar;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;

public class ZuharVibrationService  extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);

        // Stop the service after setting vibration mode
        stopSelf();

        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

