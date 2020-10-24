package example;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("娇娇");

        Proxy proxy = new Proxy(mm);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    } // main

} // Client
