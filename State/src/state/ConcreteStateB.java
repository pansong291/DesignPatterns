package state;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        // 设置状态B的下一个状态是A
        context.setState(new ConcreteStateA());
    }
} // ConcreteStateB
