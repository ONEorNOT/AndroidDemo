package cn.studyjams.s1.sj64.hufei;

import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }

    protected void setStatusBar() {
        ToolbarUtil.setColor(this, getResources().getColor(R.color.colorPrimary));
    }

}
