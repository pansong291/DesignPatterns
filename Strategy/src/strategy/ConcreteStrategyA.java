package strategy;

/**
 * ConcreteStrategy, 封装了具体的算法或行为, 继承于 Strategy
 */
public class ConcreteStrategyA extends Strategy {

    // 算法A实现方法
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
} // ConcreteStrategyA
