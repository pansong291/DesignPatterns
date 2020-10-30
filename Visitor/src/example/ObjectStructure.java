package example;

import java.util.LinkedList;
import java.util.List;

/**
 * 对象结构
 */
public class ObjectStructure {
    private List<Person> elements = new LinkedList<>();

    // 增加
    public void attach(Person element) {
        elements.add(element);
    } // attach

    // 移除
    public void detach(Person element) {
        elements.remove(element);
    } // detach

    // 显示
    public void display(Action visitor) {
        for (Person element : elements) {
            element.accept(visitor);
        }
    } // display
} // ObjectStructure
