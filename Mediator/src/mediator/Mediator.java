package mediator;

/**
 * 中介者
 */
public interface Mediator {
    /**
     * 发送消息方法, 得到发送消息和同事对象
     *
     * @param message
     * @param colleague
     */
    void send(String message, Colleague colleague);
} // Mediator
