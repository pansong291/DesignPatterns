package example;

public class Work {
    private State current;
    private int hour; // 钟点属性, 状态转换依据
    private boolean finish; // 任务完成属性, 是下班的依据

    public Work() {
        // 工作初始化为上午工作状态
        // 即上午 9 点开始上班
        current = new ForenoonState();
        System.out.println("当前是上午状态");
    }

    public void writeProgram() {
        current.writeProgram(this);
    } // writeProgram

    public void setState(State current) {
        this.current = current;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        System.out.println("时间更新: " + hour);
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
} // Work
