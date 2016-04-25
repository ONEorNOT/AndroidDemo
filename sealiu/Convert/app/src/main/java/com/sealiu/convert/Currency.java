package com.sealiu.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
