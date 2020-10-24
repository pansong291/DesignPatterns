package decorator;

/**
 * ConcreteDecorator 就是具体的装饰对象, 起到给 Component 添加职责的功能
 */
public class ConcreteDecoratorA extends Decorator {
    // 本类独有的功能, 以区别于 ConcreteDecoratorB
    private String addedState;

    @Override
    public void operation() {
        /*
         * 首先运行原 Component 的 Operation(),
         * 再执行本类的功能, 如 addedState,
         * 相当于对原 Component 进行了装饰
         */
        super.operation();
        addedState = "New State";
        System.out.println("ConcreteDecoratorA.Operation(): 具体装饰对象A的操作");
    } // Operation
} // ConcreteDecorator
