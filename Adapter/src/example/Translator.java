package example;

/**
 * 翻译者类
 */
public class Translator extends Player {
    // 表明翻译者与外籍球员有关联
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        // 翻译者将 'attack' 翻译为 '进攻' 告诉外籍中锋
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        // 翻译者将 'defense' 翻译为 '防守' 告诉外籍中锋
        foreignCenter.防守();
    }

} // Translator
