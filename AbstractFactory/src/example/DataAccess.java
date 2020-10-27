package example;

public class DataAccess {
    private static String pkgName = "example";
    private static String[] dbs = {"SqlServer", "Access"};
    private static final int WHICH_DB = 0;

    public static User createUser() {
        return (User) getInstance(pkgName, dbs[WHICH_DB] + User.class.getSimpleName());
    } // createUser

    public static Department createDepartment() {
        return (Department) getInstance(pkgName, dbs[WHICH_DB] + Department.class.getSimpleName());
    } // createDepartment

    public static <T> T Create(Class<T> clazz) {
        return (T) getInstance(pkgName, dbs[WHICH_DB] + clazz.getSimpleName());
    } // Create

    private static Object getInstance(String pkgName, String className) {
        try {
            return Class.forName(pkgName + "." + className).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    } // getInstance

} // DataAccess
