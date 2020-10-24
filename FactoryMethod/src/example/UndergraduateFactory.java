package example;

/**
 * 学雷锋的大学生工厂
 */
public class UndergraduateFactory implements Factory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }

} // UndergraduateFactory
