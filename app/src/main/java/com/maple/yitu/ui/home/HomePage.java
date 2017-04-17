package com.maple.yitu.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;

import com.maple.yitu.R;
import com.maple.yitu.base.BaseFragment;
import com.maple.yitu.bean.CourseItem;
import com.maple.yitu.ui.draw.DrawActivity;
import com.maple.yitu.ui.setting.SettingActivity;
import com.yalantis.phoenix.PullToRefreshView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author maple
 * @time 17/4/14 下午3:31
 */
public class HomePage extends BaseFragment implements View.OnClickListener {
    @BindView(R.id.pull_to_refresh) PullToRefreshView pull_to_refresh;
    @BindView(R.id.prgw_ServerRecords) GridView prgw_ServerRecords;

    MainActivity mActivity;
    RecordsAdapter recordsAdapter;

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
        List<CourseItem> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(new CourseItem("Course " + i));

        recordsAdapter = new RecordsAdapter(mContext, list);
        prgw_ServerRecords.setAdapter(recordsAdapter);

    }

    @Override
    public void initListener() {
        mActivity.setLeftBtnClickListener(this);
        mActivity.setRightBtnClickListener(this);

        pull_to_refresh.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                pull_to_refresh.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        recordsAdapter.remove(0);
                        pull_to_refresh.setRefreshing(false);
                    }
                }, 800);
            }
        });
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
