package example;

/**
 * 男人
 */
public class Man implements Person {
    @Override
    public void accept(Action visitor) {
        /*
         * 首先在客户程序中将具体状态作为参数传递给"男人"类完成了一次分派,
         * 然后"男人"类调用作为参数的"具体状态"中的方法"男人反应",
         * 同时将自己(this)作为参数传递进去. 这便完成了第二次分派
         */
        visitor.getManConclusion(this);
    }

    public String getType() {
        return "男人";
    } // getType
} // Man
