package flyweight;

/**
 * 享元模式
 */
public class Client {
    public static void main(String[] args) {
        int extrinsicState = 22; // 代码外部状态

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicState);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicState);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicState);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();

        uf.operation(--extrinsicState);
    } // main

} // Client
