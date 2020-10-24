package decorator;

/**
 * Decorator, 装饰抽象类, 继承了 Component,
 * 从外类来扩展 Component 类的功能, 但对于 Component 来说,
 * 是无需知道 Decorator 的存在的
 */
public class Decorator extends Component {
    protected Component component;

    /**
     * 设置 Component
     *
     * @param component
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写 Operation(), 实际执行的是 Component 的 Operation()
     */
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    } // Operation
} // Decorator
