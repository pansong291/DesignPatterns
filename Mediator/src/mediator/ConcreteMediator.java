package mediator;

public class ConcreteMediator implements Mediator {
    // 需要了解所有的具体同事对象
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    @Override
    public void send(String message, Colleague colleague) {
        // 根据对象做出选择判断, 通知对象
        if (colleague == colleague1) {
            colleague2.notifyMsg(message);
        } else {
            colleague1.notifyMsg(message);
        }
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
} // ConcreteMediator
