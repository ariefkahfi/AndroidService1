package com.kahfi.arief.belajarandroidservice1;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kahfi.arief.belajarandroidservice1.Service.MyIntentService;
import com.kahfi.arief.belajarandroidservice1.Service.MyService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button serviceClick;
    private Button serviceIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceClick = (Button)findViewById(R.id.serviceClick);
        serviceClick.setOnClickListener(this);


        serviceIntent = (Button)findViewById(R.id.serviceIntenClick);
        serviceIntent.setOnClickListener(this);
    }



    public void mulaiIntenService(){
        Intent inten = new Intent(this, MyIntentService.class);
        startService(inten);
    }

    public void mulaiService(){
        Intent inten = new Intent(this, MyService.class);
        startService(inten);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.serviceClick:
                mulaiService();
                break;
            case R.id.serviceIntenClick :
                mulaiIntenService();
                break;
        }
    }


}
