package example;

/**
 * 工厂方法模式
 */
public class Client {
    public static void main(String[] args) {
        // 要换成 '社区志愿者', 只需修改 new 后面的就可以
        Factory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.sweep();
        student.wash();
        student.buyRice();
    } // main

} // Client
