package singleton;

public class SingletonHungry {
    private static final SingletonHungry SINGLETON_HUNGRY;

    static {
        SINGLETON_HUNGRY = new SingletonHungry();
    }

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return SINGLETON_HUNGRY;
    } // getInstance

    public void show(String flag) {
        System.out.println(flag + ", 此对象为: " + this);
    } // show
} // SingletonHungry
