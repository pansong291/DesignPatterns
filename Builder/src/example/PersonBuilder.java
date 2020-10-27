package example;

/**
 * 抽象的建造人的类
 * 稳定建造过程, 不遗忘其中任何一步
 */
public abstract class PersonBuilder {
    abstract void buildHead();

    abstract void buildBody();

    abstract void buildArmLeft();

    abstract void buildArmRight();

    abstract void buildLegLeft();

    abstract void buildLegRight();

} // PersonBuilder
