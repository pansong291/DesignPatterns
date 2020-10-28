package example;

/**
 * 财务部
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    void add(Company company) {

    }

    @Override
    void remove(Company company) {

    }

    @Override
    void display(int depth) {
        // 显示其名称和级别
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
    }

    @Override
    void lineOfDuty() {
        System.out.println(name + " 公司财务收支管理");
    }
} // FinanceDepartment
