package baina.android.com.design.patterns.Decorative;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import baina.android.com.design.patterns.R;

public class DecorativeActivity extends AppCompatActivity {

    public static final String TAG = DecorativeActivity.class.getSimpleName();

    private Window windowS;
    private Window windowA;
    private Window windowB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorative);

        windowS = new SimpleWindow();
        windowA = new ADecorator(windowS);
        windowB = new BDecorator(windowA);
        windowB.display();
    }
}
