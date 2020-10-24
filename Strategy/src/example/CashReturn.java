package example;

public class CashReturn extends CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    /**
     * 返利收费, 初始化时必须输入返利条件和返利值, 比如满300返100,
     * 则 moneyCondition 为300, moneyReturn 为100
     *
     * @param moneyCondition
     * @param moneyReturn
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        // 若大于返利条件, 则需要减去返利值
        if (money >= moneyCondition) {
            return money - money / moneyCondition * moneyReturn;
        }
        return money;
    }
} // CashReturn
