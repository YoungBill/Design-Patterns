package baina.android.com.design.patterns.Observer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

import baina.android.com.design.patterns.R;

public class ObserverActivity extends AppCompatActivity implements Observer<Song> {

    private static final String TAG = ObserverActivity.class.getSimpleName();

    private int seek;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        final SongSubject songSubject = new SongSubject();
        AFragment aFragment = new AFragment();
        BFragment bFragment = new BFragment();
        songSubject.attach(this);
        songSubject.attach(aFragment);
        songSubject.attach(bFragment);

        findViewById(R.id.playBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //信息模拟
                final Song song = new Song("勇气", "葛强丽", seek);
                //计时器轮训任务
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    public void run() {
                        song.setSeek(seek++);//修改信息
                        songSubject.setSong(song);//设置信息，通知所有观察者
                    }
                }, 0, 1000);
            }
        });
    }

    @Override
    public void update(Song song) {
        //TODO:更新时的视图渲染
        Log.d(TAG, song.toString());
    }
}