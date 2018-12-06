package baina.android.com.design.patterns.Proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicLawyer implements InvocationHandler {

    private IProsecute obj;

    public DynamicLawyer() {
        obj = new Civilian();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Log.d(ProxyActivity.TAG, "invoke method:" + method);
        return method.invoke(obj, args);
    }
}