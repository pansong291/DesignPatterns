package proxy;

/**
 * Subject 类, 定义了 RealSubject 和 Proxy 的共用接口,
 * 这样就在任何使用 RealSubject 的地方都可以使用 Proxy
 */
public abstract class Subject {
    public abstract void request();

} // Subject
