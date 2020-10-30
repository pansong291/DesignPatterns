package visitor;

/**
 * 元素
 */
public interface Element {
    void accept(Visitor visitor);
} // Element
