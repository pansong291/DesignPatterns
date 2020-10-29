package flyweight;

/**
 * 所有具体享元类的接口, 通过这个接口, Flyweight 可以接受并作用于外部状态
 */
public interface Flyweight {
    void operation(int extrinsicState);
} // Flyweight
