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
        Intent intent = new Intent(this, MinService.class);
        this.startService(intent);
    }

    public void stoppService(View v) {
        Intent intent = new Intent(this, MinService.class);
        this.startService(intent);
    }

    public void sendBroadcast(View v) {
        Intent intent = new Intent(this, MinService.class);
        this.startService(intent);
    }

    public void settPeriodisk(View v) {
        Intent intent = new Intent(this, MinService.class);
        this.startService(intent);
    }

    public void stoppPeriodisk(View v) {
        Intent intent = new Intent(this, MinService.class);
        this.startService(intent);
    }
}
