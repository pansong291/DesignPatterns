package example;

/**
 * 瘦高的小人
 */
public class PersonThinBuilder extends PersonBuilder {
    @Override
    void buildHead() {
        System.out.println("构建头");
    }

    @Override
    void buildBody() {
        System.out.println("构建瘦的身体");
    }

    @Override
    void buildArmLeft() {
        System.out.println("构建长的左手");
    }

    @Override
    void buildArmRight() {
        System.out.println("构建长的右手");
    }

    @Override
    void buildLegLeft() {
        System.out.println("构建长的左腿");
    }

    @Override
    void buildLegRight() {
        System.out.println("构建长的右腿");
    }
} // PersonThinBuilder
