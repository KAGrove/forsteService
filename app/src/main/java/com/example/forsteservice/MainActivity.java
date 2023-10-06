package com.example.forsteservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastReceiver myBroadcastReceiver = new MinBroadcastReceiver();
        IntentFilter filter = new IntentFilter("com.example.service.MITTSIGNAL");
        filter.addAction("com.example.service.MITTSIGNAL");
        this.registerReceiver(myBroadcastReceiver, filter);
    }


    public void startService(View v) {
        Intent intent1 = new Intent(this, MinService.class);
        this.startService(intent1);
    }

    public void stoppService(View v) {
        Intent intent2 = new Intent(this, MinService.class);
        this.stopService(intent2);
    }

    public void sendBroadcast(View v) {
        Intent intent = new Intent();
        intent.setAction("com.example.service.MITTSIGNAL");
        sendBroadcast(intent);
    }


//    public void sendBroadcast(View v) {
//        Intent intent3 = new Intent(this, MinService.class);
//        this.sendBroadcast(intent3);
//    }
//
//    public void settPeriodisk(View v) {
//        Intent intent4 = new Intent(this, MinService.class);
//        this.settPeriodisk(intent4);
//    }
//
//    public void stoppPeriodisk(View v) {
//        Intent intent5 = new Intent(this, MinService.class);
//        this.stoppPeriodisk(intent5);
//    }
}
