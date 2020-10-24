package strategy;

/**
 * 客户端
 */
public class Client {
    /**
     * 由于实例化不同的策略, 所以最终在调用
     * context.contextInterface() 时,
     * 所获得的结果就不尽相同
     * @param args
     */
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    } // main

} // Client
