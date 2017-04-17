package com.maple.yitu.ui.home;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.maple.yitu.R;
import com.maple.yitu.base.AbsAdapter;
import com.maple.yitu.bean.CourseItem;

import java.util.List;


/**
 * 课程记录适配器
 *
 * @author maple
 * @time 17/4/14
 */
public class RecordsAdapter extends AbsAdapter<CourseItem> {

    public RecordsAdapter(Context ctx, List<CourseItem> datas) {
        super(ctx, datas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.custom_record_item_view, parent, false);
            holder = new ViewHolder();
            holder.logo = (ImageView) convertView.findViewById(R.id.iv_logo);
            holder.title = (TextView) convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //
        CourseItem item = getItem(position);

        holder.title.setText(item.title);

        return convertView;

    }

    public class ViewHolder {
        ImageView logo;
        TextView title;
    }


}
