package baina.android.com.design.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class SongSubject implements Subject<Song> {

    private List<Observer<Song>> mObservers = new ArrayList<>();//观察者对象集合
    private Song mSong;

    @Override
    public void attach(Observer<Song> observer) {
        mObservers.add(observer);
    }

    @Override
    public void detach(Observer<Song> observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer<Song> o : mObservers) {
            o.update(mSong);
        }
    }

    /**
     * 设置信息--通知所有观察者
     *
     * @param song
     */
    public void setSong(Song song) {
        mSong = song;
        notifyObserver();
    }
}