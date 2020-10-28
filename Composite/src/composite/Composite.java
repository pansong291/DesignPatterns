package composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Composite 定义有枝节点行为, 用来存储子部件,
 * 在 Component 接口中实现与子部件有关的操作, 比如增加 Add 和删除 Remove
 */
public class Composite extends Component {
    // 一个子对象集合用来存储其下属的枝节点和叶节点
    private List<Component> children = new LinkedList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        children.add(component);
    }

    @Override
    void remove(Component component) {
        children.remove(component);
    }

    @Override
    void display(int depth) {
        // 显示其枝节点名称,
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
        // 并对其下级进行遍历
        for (Component child : children) {
            child.display(depth + 1);
        }
    }

} // Composite
