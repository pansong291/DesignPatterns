package decorator;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        /*
         * 装饰的方法是: 首先调用 ConcreteComponent 实例化对象 c,
         * 然后用 ConcreteDecoratorA 的实例化对象 d1 来包装 c,
         * 再用 ConcreteComponentB 的对象 d2 来包装 d1,
         * 最终执行 d2 的 operation();
         */
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    } // main

} // Client
