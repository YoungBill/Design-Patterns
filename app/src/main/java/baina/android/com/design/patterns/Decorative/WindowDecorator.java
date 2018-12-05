package baina.android.com.design.patterns.Decorative;

/**
 * Created by taochen on 18-12-5.
 * 抽象装饰着类
 */

public class WindowDecorator implements Window {

    private Window mWindow;

    public WindowDecorator(Window window) {
        mWindow = window;
    }

    @Override
    public void display() {
        mWindow.display();
    }
}
