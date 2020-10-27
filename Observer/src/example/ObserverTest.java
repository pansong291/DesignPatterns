package example;

/**
 * 观察者模式 / 发布-订阅 模式
 */
public class ObserverTest {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer usesrZhang = new User("张三");
        Observer usesrLi = new User("李四");
        Observer usesrWang = new User("王五");

        server.registerObserver(usesrZhang);
        server.registerObserver(usesrLi);
        server.registerObserver(usesrWang);

        server.setMessage("php 是世界上最好的语言!");

        System.out.println();
        System.out.println("用户 张三 看到消息后颇为震惊, 果断取消订阅!");
        server.removeObserver(usesrZhang);

        server.setMessage("Java 是世界上最好的语言!");
    } // main

} // ObserverTest
