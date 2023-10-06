package com.example.forsteservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MinBroadcastReceiver extends BroadcastReceiver {

    public MinBroadcastReceiver() {
        // Constructor
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "I BroadcastReceiver", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(context, MinService.class);
        context.startService(i);
    }
}
