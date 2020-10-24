package factorymethod;

public class ConcreteProduct extends Product {
    @Override
    public void productMethod() {
        System.out.println("具体的产品");
    }
} // ConcreteProduct
