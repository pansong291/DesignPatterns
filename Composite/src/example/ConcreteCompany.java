package example;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体公司类
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new LinkedList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    void add(Company company) {
        children.add(company);
    }

    @Override
    void remove(Company company) {
        children.remove(company);
    }

    @Override
    void display(int depth) {
        // 显示其枝节点名称,
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
        // 并对其下级进行遍历
        for (Company child : children) {
            child.display(depth + 1);
        }
    }

    @Override
    void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
} // ConcreteCompany
