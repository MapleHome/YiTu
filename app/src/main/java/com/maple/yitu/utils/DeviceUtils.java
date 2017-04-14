package com.maple.yitu.utils;


import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;


/**
 * 设备相关的辅助类
 *
 * @author maple
 * @time 16/4/26
 */
public class DeviceUtils {
    private DeviceUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 获得屏幕宽度
     */
    public static int getScreenWidth(Context context) {
        return getScreenInfo(context).widthPixels;
    }

    /**
     * 获得屏幕高度
     */
    public static int getScreenHeight(Context context) {
        return getScreenInfo(context).heightPixels;
    }


    /**
     * 获得屏幕信息
     */
    public static DisplayMetrics getScreenInfo(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics;
    }

    /**
     * 当前是否是横屏
     */
    public static boolean isHengPing(Context context) {
        int curOrientation = context.getResources().getConfiguration().orientation; // 获取屏幕方向
        if (curOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            return true;// 横屏
        } else if (curOrientation == Configuration.ORIENTATION_PORTRAIT) {
            return false;// 竖屏
        }
        return false;
    }

    /**
     * 获得状态栏的高度
     */
    public static int getStatusHeight(Context context) {
        int statusHeight = -1;
        try {
            Class<?> clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            int height = Integer.parseInt(clazz.getField("status_bar_height").get(object).toString());
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }
}