package com.example.redes.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("El estado del app paso a Create");
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("El estado del app paso a Start");
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("El estado del app paso a Resume");
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("El estado del app paso a Pause");
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("El estado del app paso a Stop");
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("El estado del app paso a Destroy");
        // The activity is about to be destroyed.
    }

}



