package com.maple.yitu;


import android.graphics.Color;


/**
 * 常量
 *
 * @author maple
 * @time 17/4/14
 */
public class Const {
    public static final boolean IS_DEBUG = false;

    public static final long SPLASH_MIN_TIME = 1000;
    public static final String FIRST_COME_IN = "first_come_in";

    // Base 基本配置信息

    public static final int RADIUS = 8;
    /** sharepref中存储的xml名 */
    public static final String BASE_PREF = "base_pref";
    public static final String SAVE_PATH = "/yitu";//作品保存的路径
    public static final String TEMP_PATH = "/yituTemp";// 临时文件夹
    public static final String IMAGE_STORE_PATH = "image_store_path";//当前图片的存储路径
    /** intent类型 */
    public static final String PREVIEW_TYPE = "preview_type";//预览类型
    public static final String TYPE_CAMERA = "type_camera";
    public static final String TYPE_GALLERY = "type_gallery";
    public static final String TYPE_MY_WORKS = "type_my_works";
    public static final String TYPE_NORMAL_MODEL = "type_normal_model";


    // 设置信息
    /** sharepref中存储的xml名 */
    public static final String SETTING_PREF = "setting_pref";
    /** 屏幕状态（是否画图时屏幕常亮） */
    public static final String SCREEN_STATE = "screen_state";
    /** 夜间模式 */
    public static final String NIGHT_MODEL = "night_model";
    /** "摇一摇"启动app */
    public static final String SHAKE_MODEL = "shake_model";
    /** 画布宽 */
    public static final String CANVAS_WIDTH = "canvas_width";
    /** 画布高 */
    public static final String CANVAS_HEIGHT = "canvas_height";


    /** 画笔默认颜色 */
    public static final int PENCOLOR_DEFAULT = Color.BLACK;

    /** 画笔默认大小 */
    public static final int PENSIZE_DEFAULT = 4;

    /** 橡皮宽度 */
    public static final int ERASER_WIDER_DEFAULT = 3;

    /** 默认透明度 */
    public static final int PEN_ALPHA_DEFAULT = 0;
}
