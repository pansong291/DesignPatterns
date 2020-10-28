package chainofresponsibility;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("handler3 请求处理 " + request);
        } else if (successor != null) {
            // 转移到下一位
            successor.handleRequest(request);
        }
    }
} // ConcreteHandler1
