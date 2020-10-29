package flyweight;

/**
 * 为内部状态增加存储空间
 */
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体 Flyweight: " + extrinsicState);
    }
} // ConcreteFlyweight
