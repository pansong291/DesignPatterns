package example;

/**
 * 晚上工作状态
 */
public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            System.out.println("转入下班状态");
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间: " + work.getHour() + "点, 加班哦, 疲累至极");
            } else {
                work.setState(new SleepingState());
                System.out.println("转入睡觉状态");
                work.writeProgram();
            }
        }
    }
} // EveningState
