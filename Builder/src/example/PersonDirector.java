package example;

/**
 * 指挥者, 控制建造过程, 隔离用户与建造过程的关联
 */
public class PersonDirector {
    private PersonBuilder builder;

    /**
     * 用户将会告诉指挥者, 究竟需要什么样的小人
     * @param builder
     */
    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    /**
     * 根据用户的选择建造小人
     */
    public void createPerson() {
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegLeft();
        builder.buildLegRight();
    } // createPerson
} // PersonDirector
