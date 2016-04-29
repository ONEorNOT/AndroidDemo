package com.sealiu.convert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Currency extends AppCompatActivity {
    private static final String[] TYPE = new String[]{
            "￥ 人民币",
            "$ 美元",
            "\u00A5 日元",
            "NT$ 台币",
            "\u20A3 法郎",
            "\u00A3 镑",
            "\u20AC 欧元",
            "\u20BD 卢布",
            "\u20AB 越南盾",
            "\u20A8 卢比",
            "\u20A9 朝鲜圆"
    };

    Common common = new Common();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_panel);

        /**
         * add back button in the left side of actionBar.
         * this activity's parent is defined in AndroidManifest.xml.
         */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final WheelView wvLeft = (WheelView) findViewById(R.id.wv_left);
        final WheelView wvRight = (WheelView) findViewById(R.id.wv_right);

        final TextView currentTypeTextView = (TextView) findViewById(R.id.current_type);
        final TextView convertTypTextView = (TextView) findViewById(R.id.convert_type);

        final EditText editTextLeft = (EditText) findViewById(R.id.current_value_edit_text);
        final EditText editTextRight = (EditText) findViewById(R.id.convert_value_edit_text);

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
