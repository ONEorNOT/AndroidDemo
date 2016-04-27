package com.sealiu.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class Currency extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String[] PLANETS = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Pluto"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WheelView wvaOne = (WheelView) findViewById(R.id.main_wv_one);
        WheelView wvaOther = (WheelView) findViewById(R.id.main_wv_other);

        wvaOne.setOffset(1);
        wvaOne.setItems(Arrays.asList(PLANETS));
        wvaOne.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
            @Override
            public void onSelected(int selectedIndex, String item) {
                Log.d(TAG, "selectedIndex: " + selectedIndex + ", item: " + item);
            }
        });

        wvaOther.setOffset(1);
        wvaOther.setItems(Arrays.asList(PLANETS));
        wvaOther.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
            @Override
            public void onSelected(int selectedIndex, String item) {
                Log.d(TAG, "selectedIndex: " + selectedIndex + ", item: " + item);
            }
        });
    }
}
