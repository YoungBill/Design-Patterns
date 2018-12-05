package baina.android.com.design.patterns.Decorative;

import android.util.Log;

/**
 * Created by taochen on 18-12-5.
 * 具体控件类
 */

public class SimpleWindow implements Window {

    @Override
    public void display() {
        Log.d(DecorativeActivity.TAG, "显示窗体");
    }
}
