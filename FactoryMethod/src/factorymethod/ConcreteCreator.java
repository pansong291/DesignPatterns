package factorymethod;

public class ConcreteCreator implements Creator {

    @Override
    public Product factoryMethod() {
        // 返回具体的工厂
        return new ConcreteProduct();
    }
} // ConcreteCreator
