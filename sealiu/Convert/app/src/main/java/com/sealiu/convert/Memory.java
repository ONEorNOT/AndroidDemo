package com.sealiu.convert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Memory extends AppCompatActivity {

    //yotta，[尧]它， Y. 10^21，
    //zetta，[泽]它， Z. 10^18，
    //exa，[艾]可萨， E. 10^15，
    //peta，[拍]它， P. 10^12，
    //tera，[太]拉， T. 10^9，
    //giga，[吉]咖， G. 10^6，
    //mega，[兆]，M. 10^3
    private static final String[] TYPE = new String[]{
            "bit",
            "B",
            "KB",
            "MB",
            "GB",
            "TB",
            "PB"
    };

    Common common = new Common();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_panel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final WheelView wvLeft = (WheelView) findViewById(R.id.wv_left);
        final WheelView wvRight = (WheelView) findViewById(R.id.wv_right);

        final TextView currentTypeTextView = (TextView) findViewById(R.id.current_type);
        final TextView convertTypTextView = (TextView) findViewById(R.id.convert_type);

        Button changeBtn = (Button) findViewById(R.id.change_btn);

        /**
         * initiate WheelView and set OnWheelViewListener function. change the content of the
         * TextView and WheelView when the WheelView scrolled;
         */
        common.initWheelView(TYPE, currentTypeTextView, wvLeft);
        common.initWheelView(TYPE, convertTypTextView, wvRight);

        /**
         * when click the change button, swap the value of currentTypeTextView and convertTypTextView.
         * And at the same time, swap the content of wvLeft and wvRight.
         */
        common.changePosition(changeBtn, currentTypeTextView, convertTypTextView, wvLeft, wvRight, TYPE);
    }
}
