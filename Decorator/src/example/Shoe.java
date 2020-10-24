package example;

/**
 * 具体的装饰二
 */
public class Shoe extends Decorator {
    @Override
    public void show() {
        super.show();
        System.out.println(", 增添鞋子外观");
    }
} // Shoe
