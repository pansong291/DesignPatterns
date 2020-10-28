package singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;
    private static final Object SYNC_ROOT = new Object();

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            // 先判断实例是否存在, 不存在再加锁处理
            // 只在第一次需要初始化时才加锁, 后续访问将不会加锁
            synchronized (SYNC_ROOT) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    } // getInstance

    public void show(String flag) {
        System.out.println(flag + ", 此对象为: " + this);
    } // show
} // Singleton
