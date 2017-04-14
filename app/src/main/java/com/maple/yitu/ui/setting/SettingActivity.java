package com.maple.yitu.ui.setting;

import android.os.Bundle;
import android.view.View;

import com.maple.yitu.R;
import com.maple.yitu.ui.base.BaseActivity;

public class SettingActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBaseContentView(R.layout.activity_setting);

        setTitle("设置");
        setLeftBtnState("返回", View.VISIBLE, true);
        setRightBtnState(View.GONE, false);

        setLeftBtnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_left_title:
                finish();
                break;
        }
    }
}
