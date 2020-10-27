package example;

/**
 * 被观察者接口
 * 声明了添加, 删除, 通知观察者方法
 */
public interface Observable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
} // Observable
