package baina.android.com.design.patterns.Proxy;

import android.util.Log;

/**
 * Created by taochen on 18-12-6.
 * 具体目标类
 */

public class Civilian implements IProsecute {
    @Override
    public void submit() {
        Log.d(ProxyActivity.TAG, "起诉");
    }

    @Override
    public void burden() {
        Log.d(ProxyActivity.TAG, "举证");
    }

    @Override
    public void defend() {
        Log.d(ProxyActivity.TAG, "辩护");
    }

    @Override
    public void finish() {
        Log.d(ProxyActivity.TAG, "胜诉");
    }
}
