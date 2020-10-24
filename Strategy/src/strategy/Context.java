package strategy;

/**
 * Context, 用一个 ConcreteStrategy 来配置,
 * 维护一个对 Strategy 对象的引用.
 */
public class Context {
    Strategy strategy;

    /**
     * 初始化时, 传入具体的策略对象
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据具体的策略对象, 调用其算法的方法
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    } // contextInterface
} // Context
