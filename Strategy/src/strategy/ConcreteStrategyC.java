package strategy;

/**
 * ConcreteStrategy, 封装了具体的算法或行为, 继承于 Strategy
 */
public class ConcreteStrategyC extends Strategy {

    // 算法C实现
    @Override
    public void algorithmInterface() {
        System.out.println("算法C实现");
    }
} // ConcreteStrategyC
