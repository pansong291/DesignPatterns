package builder;

/**
 * 指挥者类
 */
public class Director {
    /**
     * 用来指挥建造过程
     * @param builder
     */
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    } // construct

} // Director
