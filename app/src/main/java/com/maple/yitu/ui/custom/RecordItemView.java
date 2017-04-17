package com.maple.yitu.ui.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.maple.yitu.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 
 * @author maple
 * @time 17/4/14 下午4:30
 */
public class RecordItemView extends FrameLayout {
    @BindView(R.id.iv_logo) ImageView iv_logo;
    @BindView(R.id.tv_title) TextView tv_title;

    public RecordItemView(Context context) {
        super(context);
        init();
    }

    private void init() {
        View view = View.inflate(getContext(), R.layout.custom_record_item_view, this);
        ButterKnife.bind(this, view);
    }

    public void setLogo(Bitmap icon) {
        iv_logo.setImageBitmap(icon);
    }

    public void setTitle(String title) {
        tv_title.setText(title);
    }


}
