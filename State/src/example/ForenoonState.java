package example;

/**
 * 上午工作状态
 */
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间: " + work.getHour() + "点, 上午工作, 精神百倍");
        } else {
            // 超过 12 点, 则转入中午工作状态
            work.setState(new NoonState());
            System.out.println("转入中午状态");
            work.writeProgram();
        }
    }
} // ForenoonState
