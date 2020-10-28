package chainofresponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("handler2 请求处理 " + request);
        } else if (successor != null) {
            // 转移到下一位
            successor.handleRequest(request);
        }
    }
} // ConcreteHandler1
