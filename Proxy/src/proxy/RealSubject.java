package proxy;

/**
 * RealSubject 类, 定义 Proxy 所代表的真实实体
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    } // request

} // RealSubject
