package state;

/**
 * 具体状态类, 每一个子类实现一个与 Context 的一个状态相关的行为
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        // 设置状态A的下一个状态是B
        context.setState(new ConcreteStateB());
    }
} // ConcreteStateA
