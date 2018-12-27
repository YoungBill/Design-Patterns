package baina.android.com.design.patterns.Observer;

public interface Subject<T> {
    /**
     * 观察者关联
     * @param o 待观察者(信息体)
     */
    void attach(Observer<T> o);

    /**
     * 观察者取消关联
     * @param o 待观察者()
     */
    void detach(Observer<T> o);

    /**
     * 当信息体更新时调用,用于通知观察者
     */
    void notifyObserver();
}