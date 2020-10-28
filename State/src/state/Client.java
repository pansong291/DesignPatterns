package state;

public class Client {
    public static void main(String[] args) {
        // 设置初始状态为A
        Context context = new Context(new ConcreteStateA());
        // 不断的请求, 同时更改状态
        context.request();
        context.request();
        context.request();
        context.request();
    } // main

} // Client
