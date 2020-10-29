package mediator;

/**
 * 中介者模式
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        // 两个具体同事认识中介者
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        // 中介者认识各个具体同事
        m.setColleague1(c1);
        m.setColleague2(c2);

        // 具体同事通过中介转发信息
        c1.send("吃没?");
        c2.send("没, 你请?");
    } // main

} // Client
