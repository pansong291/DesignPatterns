package decorator;

/**
 * ConcreteDecorator 就是具体的装饰对象, 起到给 Component 添加职责的功能
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        /*
         * 首先运行原 Component 的 Operation(),
         * 再执行本类的功能, 如 addedBehavior(),
         * 相当于对原 Component 进行了装饰
         */
        super.operation();
        addedBehavior();
        System.out.println("ConcreteDecoratorB.Operation(): 具体装饰对象B的操作");
    }

    /**
     * 本类独有的方法, 以区别于 ConcreteDecoratorA
     */
    public void addedBehavior() {

    } // addedBehavior
} // ConcreteDecoratorB
