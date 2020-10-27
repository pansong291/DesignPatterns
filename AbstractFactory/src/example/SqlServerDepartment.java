package example;

/**
 * 访问 SqlServer 的 Department
 */
public class SqlServerDepartment implements Department {
    @Override
    public void insert(Department department) {
        System.out.println("在 SqlServer 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment() {
        System.out.println("在 SqlServer 中根据 ID 得到 Department 表的一条记录");
        return null;
    }

} // SqlServerDepartment
