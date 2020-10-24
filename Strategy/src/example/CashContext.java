package example;

public class CashContext {
    CashSuper cashSuper; // 声明一个 CashSuper 对象

    /**
     * 参数不是具体的收费策略对象, 而是表示收费类型的字符串
     *
     * @param type
     */
    public CashContext(String type) {
        /*
         * 将实例化具体策略的过程由客户端转移到 Context 类中
         * 简单工厂的应用
         */
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
            default:
        }
    } // CashContext

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    } // getResult
} // CashContext
