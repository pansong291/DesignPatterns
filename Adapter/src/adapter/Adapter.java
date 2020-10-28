package adapter;

/**
 * 通过在内部包装一个 Adapter 对象, 把源接口转换成目标接口
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // 把表面上调用 request() 方法变成实际调用 specificRequest()
        adaptee.specificRequest();
    }
} // Adapter
