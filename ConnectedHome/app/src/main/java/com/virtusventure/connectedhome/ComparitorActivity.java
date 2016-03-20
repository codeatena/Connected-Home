package com.virtusventure.connectedhome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ComparitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparitor);

    }

    public void onDetail(View v) {
        // does something very interesting

        Intent intent = new Intent(this ,DetailActivity.class);
        startActivity(intent);
    }
}
