package composite;

public abstract class Component {
protected String name;

    public Component(String name) {
        this.name = name;
    }

    /*
     * 通常用 Add 和 Remove 方法来提供
     * 增加或移除树叶或树枝的功能
     */
    abstract void add(Component component);
    abstract void remove(Component component);
    abstract void display(int depth);
} // Component
