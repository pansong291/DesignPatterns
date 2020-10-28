package example;

/**
 * 人力资源部
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.println(name + " 员工招聘培训管理");
    }
} // HRDepartment
