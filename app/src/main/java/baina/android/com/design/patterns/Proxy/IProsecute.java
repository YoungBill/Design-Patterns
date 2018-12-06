package baina.android.com.design.patterns.Proxy;

/**
 * Created by taochen on 18-12-6.
 * 代理接口
 */

public interface IProsecute {

    // 提交申请
    void submit();

    // 进行举证
    void burden();

    // 开始辩护
    void defend();

    // 诉讼完成
    void finish();
}
