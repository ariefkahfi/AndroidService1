package com.kahfi.arief.belajarandroidservice1.Service;

import android.app.Activity;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.kahfi.arief.belajarandroidservice1.R;

/**
 * Created by arief on 15/09/17.
 */

public class MyIntentService extends IntentService {



    public MyIntentService() {
        super("MyIntentServiceClass");
    }


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {


        int i = 0;
        while (i<=5){
            Log.e("onHandleCounter", String.valueOf(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("MyIntentService","Destroyed");
    }
}
