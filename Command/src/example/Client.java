package example;

public class Client {
    public static void main(String[] args) {
        // 开店前的准备
        Barbecuer boy=new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        // 开门营业, 顾客点菜
        girl.addOrder(bakeMuttonCommand1);
        girl.addOrder(bakeMuttonCommand2);
        girl.addOrder(bakeChickenWingCommand1);

        // 点菜完毕, 通知厨房
        girl.notifyExecute();
    } // main

} // Client
