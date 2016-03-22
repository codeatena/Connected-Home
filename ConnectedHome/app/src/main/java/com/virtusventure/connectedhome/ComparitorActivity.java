package com.virtusventure.connectedhome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComparitorActivity extends BaseActivity {

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
