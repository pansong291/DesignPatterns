package example;

/**
 * 中介者模式
 */
public class Client {
    public static void main(String[] args) {
        UnitedNationSecurityCouncil unsc = new UnitedNationSecurityCouncil();

        USA usa = new USA(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setUsa(usa);
        unsc.setIraq(iraq);

        usa.declare("不准研制核武器, 否则要发动战争!");
        iraq.declare("我们没有核武器, 也不怕侵略!");
    } // main

} // Client
