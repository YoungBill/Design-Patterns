package baina.android.com.design.patterns.Decorative;

import android.util.Log;

/**
 * Created by taochen on 18-12-5.
 * 具体装饰着类
 */

public class ADecorator extends WindowDecorator {

    public ADecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        Log.d(DecorativeActivity.TAG, "加上A装饰");
        super.display();
    }
}
