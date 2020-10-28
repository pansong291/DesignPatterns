package example;

/**
 * 睡觉状态
 */
public class SleepingState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间: " + work.getHour() + "点, 不行了, 睡着了");
    }
} // SleepingState
