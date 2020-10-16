package com.example.datacollectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button Walking,Running,Standing,Upstairs,Downstairs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Walking = (Button) findViewById(R.id.walking);
        Running = (Button) findViewById(R.id.running);
        Standing = (Button) findViewById(R.id.downstairs);
        Upstairs = (Button) findViewById(R.id.upstairs);
        Downstairs = (Button) findViewById(R.id.downstairs);

        Walking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, walking.class);
                startActivity(intent);
            }
        });

        Running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, running.class);
                startActivity(intent);
            }
        });

        Standing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, standing.class);
                startActivity(intent);
            }
        });

        Upstairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, upstairs.class);
                startActivity(intent);
            }
        });

        Downstairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, downstairs.class);
                startActivity(intent);
            }
        });


    }
}