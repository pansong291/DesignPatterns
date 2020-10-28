package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    // 存放聚合对象
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return items.size();
    } // getCount

    public Object get(int i) {
        return items.get(i);
    } // get

    public void set(int i, Object o) {
        items.set(i, o);
    } // set

    public void add(Object o) {
        items.add(o);
    } // add
} // ConcreteAggregate
