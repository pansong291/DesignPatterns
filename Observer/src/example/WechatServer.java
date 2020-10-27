package example;

import java.util.LinkedList;
import java.util.List;

public class WechatServer implements Observable {
    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty())
            list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("微信服务更新消息: " + message);
        notifyObserver();
    } // setMessage
} // WechatServer
