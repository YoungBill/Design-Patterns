package baina.android.com.design.patterns.Proxy;

import android.util.Log;

/**
 * 代理类
 */
public class Lawyer implements IProsecute {

    private IProsecute mCivilian;

    public Lawyer() {
        mCivilian = new Civilian();
    }

    @Override
    public void submit() {
        Log.d(ProxyActivity.TAG, "律师代理");
        mCivilian.submit();
    }

    @Override
    public void burden() {
        Log.d(ProxyActivity.TAG, "律师代理");
        mCivilian.burden();
    }

    @Override
    public void defend() {
        Log.d(ProxyActivity.TAG, "律师代理");
        mCivilian.defend();
    }

    @Override
    public void finish() {
        Log.d(ProxyActivity.TAG, "律师代理");
        mCivilian.finish();
    }
}