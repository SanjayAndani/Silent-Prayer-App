package com.software.silentprayer.autosilent.Fajar;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;

public class NormalModeService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);

        // Stop the service after setting normal ringing mode
        stopSelf();

        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

