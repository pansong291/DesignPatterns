package example;

public class CashNormal extends CashSuper {

    /**
     * 正常收费, 原价返回
     *
     * @param money
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
} // CashNormal
