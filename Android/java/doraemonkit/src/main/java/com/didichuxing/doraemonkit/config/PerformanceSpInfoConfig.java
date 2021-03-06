package com.didichuxing.doraemonkit.config;

import android.content.Context;

import com.didichuxing.doraemonkit.DoraemonKit;
import com.didichuxing.doraemonkit.constant.SharedPrefsKey;
import com.didichuxing.doraemonkit.kit.largepicture.LargePictureManager;
import com.didichuxing.doraemonkit.util.SharedPrefsUtil;

/**
 * Created by wanglikun on 2018/9/14.
 * 将配置信息保存在sp中
 */

public class PerformanceSpInfoConfig {

    /**
     * 判断是否开启大图检测
     *
     * @return
     */
    public static boolean isLargeImgOpen() {
        return SharedPrefsUtil.getBoolean(SharedPrefsKey.LARGE_IMG_OPEN, false);
    }

    /**
     * 设置打开或者关闭大图检测
     *
     * @param open
     */
    public static void setLargeImgOpen(boolean open) {
        SharedPrefsUtil.putBoolean(SharedPrefsKey.LARGE_IMG_OPEN, open);
    }


    /**
     * 设置大图内存阈值
     *
     * @param threshold
     */
    public static void setLargeImgMemoryThreshold(float threshold) {
        SharedPrefsUtil.putFloat(SharedPrefsKey.LARGE_IMG_MEMORY_THRESHOLD, threshold);
        LargePictureManager.getInstance().setMemoryThreshold(threshold);
    }


    /**
     * 获得大图内存阈值
     *
     * @param threshold
     */
    public static double getLargeImgMemoryThreshold(float threshold) {
        return SharedPrefsUtil.getFloat(SharedPrefsKey.LARGE_IMG_MEMORY_THRESHOLD, threshold);
    }

    /**
     * 设置大图文件阈值
     *
     * @param threshold
     */
    public static void setLargeImgFileThreshold(float threshold) {
        SharedPrefsUtil.putFloat(SharedPrefsKey.LARGE_IMG_FILE_THRESHOLD, threshold);
        LargePictureManager.getInstance().setFileThreshold(threshold);
    }

    /**
     * 获得大图文件阈值
     *
     * @param threshold
     */
    public static double getLargeImgFileThreshold(float threshold) {
        return SharedPrefsUtil.getFloat(SharedPrefsKey.LARGE_IMG_FILE_THRESHOLD, threshold);
    }

}
