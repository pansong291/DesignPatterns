package composite;

public class Client {
    public static void main(String[] args) {
        /*
         * 生成树根 root, 根上长出两叶 LeafA 和 LeafB
         */
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        /*
         * 根上长出分枝 CompositeX, 分枝上也有两叶 LeafXA 和 LeafXB
         */
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        /*
         * 在 CompositeX 上再长出分枝 CompositeXY,
         * 分枝上也有两叶 LeafXYA 和 LeafXYB
         */
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);

        /*
         * 根部又长出两叶 LeafC 和 LeafD, 可惜 LeafD 没长牢, 被风吹走了
         */
        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        // 显示大树的样子
        root.display(0);
    } // main

} // Client
