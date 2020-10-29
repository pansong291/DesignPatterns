package mediator;

/**
 * 具体同事对象
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        // 发送信息时通常是中介者发送出去的
        mediator.send(message, this);
    } // send

    public void notifyMsg(String message) {
        System.out.println("同事 1 得到信息: " + message);
    } // notifyMsg
} // ConcreteColleague1
