package baina.android.com.design.patterns.Observer;

import android.util.Log;

public class BFragment implements Observer<Song> {

    private String TAG = BFragment.class.getSimpleName();

    @Override
    public void update(Song song) {
        //TODO:更新时的视图渲染
        Log.d(TAG, song.toString());
    }
}