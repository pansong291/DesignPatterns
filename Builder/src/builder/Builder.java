package builder;

/**
 * 抽象建造者类, 确定产品由两个部件 partA 和 partB 组成,
 * 并声明一个得到产品建造后结果的方法
 */
public abstract class Builder {
    abstract void buildPartA();

    abstract void buildPartB();

    abstract Product getResult();

} // Builder
