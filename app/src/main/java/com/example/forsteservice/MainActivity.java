package com.example.forsteservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View v) {
        Intent intent1 = new Intent(this, MinService.class);
        this.startService(intent1);
    }

    public void stoppService(View v) {
        Intent intent2 = new Intent(this, MinService.class);
        this.stopService(intent2);
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
