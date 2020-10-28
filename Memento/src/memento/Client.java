package memento;

public class Client {
    public static void main(String[] args) {
        /*
         * 初始状态
         */
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        /*
         * 保存状态时, 由于有了很好的封装, 可以隐藏 Originator 的实现细节
         */
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        /*
         * 改变状态
         */
        originator.setState("Off");
        originator.show();

        /*
         * 恢复原状态
         */
        originator.setMemento(caretaker.getMemento());
        originator.show();
    } // main

} // Client
