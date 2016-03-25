package com.example.gaokang.teststagrecyclerview;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * 项目名称：TestStagRecyclerView
 * 类描述：
 * 创建人：gaokang
 * 创建时间：2016/3/25 16:38
 * 修改人：gaokang
 * 修改时间：2016/3/25 16:38
 * 修改备注：
 */
public class Utils {
    /**
     * 获取屏幕设备信息描述对象
     *
     * @param activity
     * @return
     */
    public final static DisplayMetrics getWindowsDisplayMetrics(
            Activity activity) {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm;
    }

    /**
     * 获取屏幕的宽度
     *
     * @param activity
     * @return
     */
    public final static int getWindowsWidth(Activity activity) {
        return getWindowsDisplayMetrics(activity).widthPixels;
    }

    /**
     * 获取屏幕的高度
     *
     * @param activity
     * @return
     */
    public final static int getWindowsHeight(Activity activity) {
        return getWindowsDisplayMetrics(activity).heightPixels;
    }
}
