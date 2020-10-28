package example;

/**
 * 手机品牌抽象类
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
} // HandsetBrand
