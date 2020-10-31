package com.example.datacollectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class walking extends AppCompatActivity implements SensorEventListener{
    private static final String TAG="walking";

    private SensorManager sensorManager;
    private Sensor accelerometer;
    private TextView x_ac,y_ac,z_ac,x_gyr,y_gyr,z_gyr;
    private EditText Name;

    private Button update_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walking);

        Name=(EditText)findViewById(R.id.name);

        x_ac=(TextView)findViewById(R.id.x_acc);
        y_ac=(TextView)findViewById(R.id.y_acc);
        z_ac=(TextView)findViewById(R.id.z_acc);
        x_gyr=(TextView)findViewById(R.id.x_gy);
        y_gyr=(TextView)findViewById(R.id.y_gy);
        z_gyr=(TextView)findViewById(R.id.z_gy);


        update_Button=(Button)findViewById(R.id.send);

       sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        accelerometer=sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


        sensorManager.registerListener(walking.this,accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        Log.d(TAG,"onCreate:Registered Accelerometer Listener");

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    @Override
    public void onSensorChanged(SensorEvent event) {

        Log.d(TAG,"onSensorChanged:X:"+event.values[0]+"Y:"+event.values[1]+"Z:"+event.values[2]);
        x_ac.setText("X_Accelerometer: "+event.values[0]);
        y_ac.setText("Y_Accelerometer: "+event.values[1]);
        z_ac.setText("Z_Acelerometer: "+event.values[2]);
    }

}