package iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate collection = new ConcreteAggregate();
        collection.add("大鸟");
        collection.add("小菜");
        collection.add("行李");
        collection.add("老外");
        collection.add("公交内部员工");
        collection.add("小偷");

        Iterator iterator = new ConcreteIteratorDesc(collection);
        Object item = iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + " 请买车票!");
            iterator.next();
        }
    } // main

} // Client
