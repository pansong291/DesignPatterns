package visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        // 充分利用双分派技术, 实现处理与数据结构的分离
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        // 其他相关方法
    } // operationA
} // ConcreteElementA
