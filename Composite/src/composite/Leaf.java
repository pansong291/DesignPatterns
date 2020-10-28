package composite;

/**
 * Leaf 在组合中表示叶节点对象, 叶节点没有子节点
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        /*
         * 由于叶子没有再增加分枝和树叶, 所以 Add 和 Remove 方法实现它没有意义,
         * 但这样做可以消除叶节点和枝节点对象在抽象层次的区别, 它们具备完全一致的接口
         */
        System.out.println("Cannot add to a leaf");
    }

    @Override
    void remove(Component component) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    void display(int depth) {
        // 叶节点的具体方法, 此处是显示其名称和级别
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
    }
} // Leaf
