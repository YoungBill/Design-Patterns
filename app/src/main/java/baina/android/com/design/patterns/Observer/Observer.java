package baina.android.com.design.patterns.Observer;

public interface Observer<T> {
    /**
     * 更新
     * @param t 观察变化的信息体
     */
    void update(T t);
}
