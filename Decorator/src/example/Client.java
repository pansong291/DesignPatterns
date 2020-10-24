package example;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("小明");
        TShirt tShirt = new TShirt();
        Shoe shoe = new Shoe();

        tShirt.decorator(person);
        shoe.decorator(tShirt);

        shoe.show();
    } // main

} // Client
