package visitor;

public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() +
                " 被 " + getClass().getSimpleName() + " 访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() +
                " 被 " + getClass().getSimpleName() + " 访问");
    }
} // ConcreteVisitor2
