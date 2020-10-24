package example;

/**
 * 学雷锋的社区志愿者工厂
 */
public class VolunteerFactory implements Factory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }

} // VolunteerFactory
