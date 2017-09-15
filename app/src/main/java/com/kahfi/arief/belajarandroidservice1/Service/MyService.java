package com.kahfi.arief.belajarandroidservice1.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by arief on 15/09/17.
 */

public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("MyService","onStartCommand()");
        doWork();
        return super.onStartCommand(intent,flags,startId);
    }


    public void doWork(){
        Log.e("MyService","doWork()");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0 ;

                while (count<=5){
                   Log.e("onThreadServiceRunning",String.valueOf(count));
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
               }
            }
        });
        t1.start();
    }



    @Override
    public void onDestroy() {

        Log.e("MyService","OnDestroy()");
        super.onDestroy();
    }
}
