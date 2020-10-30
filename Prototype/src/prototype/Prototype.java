package prototype;

/**
 * 原型
 */
public abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract Prototype clone();
} // Prototype
