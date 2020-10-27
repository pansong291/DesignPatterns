package builder;

import java.util.LinkedList;
import java.util.List;

/**
 * 产品类, 由多个部件组成
 */
public class Product {
    List<String> parts = new LinkedList<>();

    /**
     * 添加产品部件
     *
     * @param part
     */
    public void add(String part) {
        parts.add(part);
    } // add

    /**
     * 列举所有的产品部件
     */
    public void show() {
        System.out.println("产品 创建 ----");
        for (String part : parts) {
            System.out.println(part);
        }
    } // show
} // Product
