package state;

/**
 * 维护一个 State 子类的实例. 这个实例定义当前的状态
 */
public class Context {
    private State state;

    /**
     * 定义初始状态
     *
     * @param state
     */
    public Context(State state) {
        this.state = state;
    }

    /**
     * 对请求做处理, 并设置下一状态
     */
    public void request() {
        state.handle(this);
    } // request

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("当前状态: " + this.state.getClass().getSimpleName());
        this.state = state;
    }
} // Context
