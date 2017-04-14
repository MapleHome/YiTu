package com.maple.yitu.ui.home;

import android.os.Bundle;

import com.maple.yitu.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userDefContentView();

        addView(new HomePage());
    }

}
