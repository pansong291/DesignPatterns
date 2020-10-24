package example;

/**
 * 让 "追求者" 实现 "送礼物" 接口
 */
public class Pursuit implements GiveGift {
    String name = "追求者";
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + ", " + name + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ", " + name + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + ", " + name + "送你巧克力");
    }
} // Pursuit
