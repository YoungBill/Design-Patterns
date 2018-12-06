package baina.android.com.design.patterns.Proxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.lang.reflect.Proxy;

import baina.android.com.design.patterns.R;

public class ProxyActivity extends AppCompatActivity {

    public static final String TAG = ProxyActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);

        findViewById(R.id.sProxyBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sProxy();
            }
        });

        findViewById(R.id.dProxyBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dProxy();
            }
        });
    }

    private void sProxy() {
        Log.d(TAG, "静态代理");
        IProsecute lawyer = new Lawyer();
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

    private void dProxy() {
        Log.d(TAG, "动态代理");
        DynamicLawyer lawyer = new DynamicLawyer();
        IProsecute prosecute = (IProsecute) Proxy.newProxyInstance(getClassLoader(), new Class[]{IProsecute.class}, lawyer);
        prosecute.submit();
        prosecute.burden();
        prosecute.defend();
        prosecute.finish();
    }
}
