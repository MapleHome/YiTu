package com.maple.yitu.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.maple.yitu.R;
import com.maple.yitu.ui.base.BaseFragment;
import com.maple.yitu.ui.draw.DrawActivity;
import com.maple.yitu.ui.setting.SettingActivity;

import butterknife.ButterKnife;

/**
 * @author maple
 * @time 17/4/14 下午3:31
 */
public class HomePage extends BaseFragment implements View.OnClickListener {

    MainActivity mActivity;

    @Override
    public View initView(LayoutInflater inflater) {
        view = inflater.inflate(R.layout.fragment_home, null);
        ButterKnife.bind(this, view);

        mActivity = (MainActivity) getActivity();
        mActivity.setTitle("易图");
        mActivity.setLeftBtnState("画板", View.VISIBLE, true);
        mActivity.setRightBtnState("设置", View.VISIBLE, true);

        return view;
    }

    @Override
    public void initData(Bundle savedInstanceState) {


    }

    @Override
    public void initListener() {
        mActivity.setLeftBtnClickListener(this);
        mActivity.setRightBtnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_left_title:
                jumpDrawPage();
                break;
            case R.id.tv_right_title:
                jumpSettingPage();
                break;
        }
    }

    private void jumpDrawPage() {
        Intent intent = new Intent(mContext, DrawActivity.class);
        startActivity(intent);
    }

    private void jumpSettingPage() {
        Intent intent = new Intent(mContext, SettingActivity.class);
        startActivity(intent);
    }
}
