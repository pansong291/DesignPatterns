package example;

public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    /**
     * 打折收费, 初始化时, 必须要输入折扣率, 如八折就是 0.8
     *
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
} // CashRebate
