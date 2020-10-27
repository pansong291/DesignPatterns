package example;

/**
 * 访问 SqlServer 的 User
 */
public class SqlServerUser implements User {
    @Override
    public void insert(User user) {
        System.out.println("在 SqlServer 中给 User 表增加一条记录");
    }

    @Override
    public User getUser() {
        System.out.println("在 SqlServer 中根据 ID 得到 User 表的一条记录");
        return null;
    }

} // SqlServerUser
