package example;

/**
 * 具体的装饰一
 */
public class TShirt extends Decorator {
    @Override
    public void show() {
        super.show();
        System.out.print(", 增添T恤外观");
    }
} // TShirt
