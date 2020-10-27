package example;

/**
 * 访问 Access 的 Department
 */
public class AccessDepartment implements Department {
    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment() {
        System.out.println("在 Access 中根据 ID 得到 Department 表的一条记录");
        return null;
    }

} // AccessDepartment
