package example;

public class Client {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("打8折");
        System.out.println(cashContext.getResult(500));
    } // main

} // Client
