package chainofresponsibility;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("handler1 请求处理 " + request);
        } else if (successor != null) {
            // 转移到下一位
            successor.handleRequest(request);
        }
    }
} // ConcreteHandler1
