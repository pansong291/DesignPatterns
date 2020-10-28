package memento;

/**
 * 发起人类
 */
public class Originator {
    private String state;

    /**
     * 创建备忘录, 将当前需要保存的信息导入 Memento 对象
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    } // createMemento

    /**
     * 恢复备忘录, 将 Memento 导入并将相关数据恢复
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        state = memento.getState();
    } // setMemento

    /**
     * 显示数据
     */
    public void show() {
        System.out.println("state = " + state);
    } // show

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
} // Originator
