package example;

public class Client {
    public static void main(String[] args) {
        DataAccess.createUser().insert(null);
        DataAccess.createDepartment().getDepartment();
        DataAccess.Create(User.class).getUser();
    } // main

} // Client
