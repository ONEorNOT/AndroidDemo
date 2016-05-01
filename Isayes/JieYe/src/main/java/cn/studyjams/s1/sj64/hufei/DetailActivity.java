package cn.studyjams.s1.sj64.hufei;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends BaseActivity {

    private TextView mCqContent;
    private ImageView mCqImg;
    private TextView pageTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mCqContent = $(R.id.id_cq_content);
        mCqImg = $(R.id.id_cq_img);
        pageTitle = $(R.id.id_title);
        Toolbar toolbar = $(R.id.id_toolBar);
        assert toolbar != null;
        setSupportActionBar(toolbar);
        // noinspection ConstantConditions
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_18dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        getCqContent();
    }

    private void getCqContent() {
        String flag = getIntent().getStringExtra("flag");
        if ("1".equals(flag)) {
            pageTitle.setText("承东启西、左右逢源");
            mCqImg.setVisibility(View.GONE);
        } else if ("2".equals(flag)) {
            pageTitle.setText("参与国际分工，融入全球市场");
            mCqImg.setVisibility(View.GONE);
        } else if ("3".equals(flag)) {
            pageTitle.setText("实现城市战略全球化布局");
            mCqImg.setImageResource(R.mipmap.cq_001);
        } else if ("4".equals(flag)) {
            pageTitle.setText("优化产业生态，改变傻大黑粗印象");
            mCqImg.setImageResource(R.mipmap.cq_002);
        } else if ("5".equals(flag)) {
            pageTitle.setText("渝新欧水铁联运打通与欧洲最后一公里");
            mCqImg.setImageResource(R.mipmap.cq_003);
        }
        mCqContent.setText(getIntentData());
    }

    private String getIntentData() {
        return getIntent().getStringExtra("content");
    }


    @SuppressWarnings("unchecked")
    public <TT> TT $(int id) {
        return (TT) findViewById(id);
    }

    public void returnBack(View view) {
        finish();
    }
}
