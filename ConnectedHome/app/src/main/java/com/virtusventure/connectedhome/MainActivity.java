package com.virtusventure.connectedhome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onCamera(View v) {
        // does something very interesting

        Intent intent = new Intent(this ,ComparitorActivity.class);
        startActivity(intent);
    }
}
