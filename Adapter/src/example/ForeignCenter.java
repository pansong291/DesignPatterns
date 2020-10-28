package example;

/**
 * 外籍中锋
 */
public class ForeignCenter {
    private String name;

    /**
     * 外籍中锋只懂中文 '进攻'
     */
    public void 进攻() {
        System.out.println("外籍中锋 " + name + " 进攻");
    } // 进攻

    /**
     * 外籍中锋只懂中文 '防守'
     */
    public void 防守() {
        System.out.println("外籍中锋 " + name + " 防守");
    } // 防守

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
} // ForeignCenter
