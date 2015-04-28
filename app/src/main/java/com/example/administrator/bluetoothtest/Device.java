package com.example.administrator.bluetoothtest;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.util.Log;


/**
 * Created by Administrator on 2015-4-22.
 */
public class Device extends BroadcastReceiver{
    private Handler handler;

    public Device(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Device", intent.toString());
        BluetoothDevice extra=intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
        Log.d("Device",extra.getName()+"");
        Log.d("Device",extra.getAddress()+"");
        Log.d("Device","123");
        Message message=handler.obtainMessage(0);
        message.setData(intent.getExtras());
        message.sendToTarget();

    }
}
