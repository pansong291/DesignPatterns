package command;

public class Client {
    public static void main(String[] args) {
        /*
         * 创建一个具体命令对象并设定它的接收者
         */
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    } // main

} // Client
