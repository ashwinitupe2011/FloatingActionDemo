package com.example.softcom.floatingactiondemo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.softcom.floatingactiondemo.R;
import com.example.softcom.floatingactiondemo.services.FloatingActionService;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        startService(new Intent(NextActivity.this, FloatingActionService.class));
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        startService(new Intent(NextActivity.this, FloatingActionService.class));
        finish();
    }
}
