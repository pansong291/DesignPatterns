package example;

/**
 * 访问 Access 的 User
 */
public class AccessUser implements User {
    @Override
    public void insert(User user) {
        System.out.println("在 Access 中给 User 表增加一条记录");
    }

    @Override
    public User getUser() {
        System.out.println("在 Access 中根据 ID 得到 User 表的一条记录");
        return null;
    }

} // AccessUser
