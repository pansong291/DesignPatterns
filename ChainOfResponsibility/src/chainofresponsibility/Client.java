package chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        // 设置职责链上家与下家
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
        // 循环给最小处理者提交请求, 不同的数额, 由不同权限处理者处理
        for (int request : requests) {
            h1.handleRequest(request);
        }
    } // main

} // Client
