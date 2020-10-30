package visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        o.accept(new ConcreteVisitor1());
        o.accept(new ConcreteVisitor2());
    } // main

} // Client
