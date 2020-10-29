package flyweight;

/**
 * 指那些不需要共享的 Flyweight 子类
 * 因为 Flyweight 接口共享成为可能, 但它并不强制共享
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体 Flyweight: " + extrinsicState);
    }
} // UnsharedConcreteFlyweight
