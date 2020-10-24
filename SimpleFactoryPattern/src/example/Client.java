package example;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Operation opr = OperationFactory.createOperate("+");
        opr.setNumberA(1);
        opr.setNumberB(2);
        System.out.println(opr.getResult());
    } // main

} // Client
