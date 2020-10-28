package example;

public class Forward extends Player {
    public Forward(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋 " + name + " 防守");
    }
} // Forward
