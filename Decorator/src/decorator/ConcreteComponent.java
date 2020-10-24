package decorator;

/**
 * ConcreteComponent 是定义了一个具体的对象, 也可以给这个对象添加一些职责
 * 这个相当于是要被装饰的对象
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent.Operation(): 具体对象的操作");
    }
} // ConcreteComponent
