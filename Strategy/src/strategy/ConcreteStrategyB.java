package strategy;

/**
 * ConcreteStrategy, 封装了具体的算法或行为, 继承于 Strategy
 */
public class ConcreteStrategyB extends Strategy {

    // 具体B算法
    @Override
    public void algorithmInterface() {
        System.out.println("算法B实现");
    }
} // ConcreteStrategyB
