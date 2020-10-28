package example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 服务员
 */
public class Waiter {
    // 存放具体命令
    private List<Command> orders = new ArrayList<>();

    // 添加订单
    public void addOrder(Command command) {
        if (command instanceof BakeChickenWingCommand) {
            // 客户提出请求时, 对没货的进行回绝
            System.out.println("服务员: 鸡翅没有了, 请点别的烧烤.");
        } else {
            orders.add(command);
            // 记录所点烧烤的日志, 以备算账收钱
            System.out.println("增加订单: " + command + ", 时间: " + new Date().toString());
        }
    } // addOrder

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单: " + command + ", 时间: " + new Date().toString());
    } // cancelOrder

    public void notifyExecute() {
        // 通知全部执行
        for (Command order : orders) {
            order.executeCommand();
        }
    } // notify
} // Waiter
