package example;

/**
 * 矮胖的小人
 */
public class PersonFatBuilder extends PersonBuilder {
    @Override
    void buildHead() {
        System.out.println("构建头");
    }

    @Override
    void buildBody() {
        System.out.println("构建胖的身体");
    }

    @Override
    void buildArmLeft() {
        System.out.println("构建短的左手");
    }

    @Override
    void buildArmRight() {
        System.out.println("构建短的右手");
    }

    @Override
    void buildLegLeft() {
        System.out.println("构建短的左腿");
    }

    @Override
    void buildLegRight() {
        System.out.println("构建短的右腿");
    }
} // PersonThinBuilder
