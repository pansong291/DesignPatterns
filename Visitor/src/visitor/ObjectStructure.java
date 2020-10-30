package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 能枚举它的元素, 可以提供一个高层的接口以允许访问者访问它的元素
 */
public class ObjectStructure {
    private List<Element> elements = new LinkedList<>();

    public void attach(Element element) {
        elements.add(element);
    } // attach

    public void detach(Element element) {
        elements.remove(element);
    } // detach

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    } // accept
} // ObjectStructure
