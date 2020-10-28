package state;

/**
 * 抽象状态类, 定义一个接口以封装与 Context 的一个特定状态相关的行为
 */
public interface State {
    void handle(Context context);
} // State
