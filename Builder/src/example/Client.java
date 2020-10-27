package example;

public class Client {
    public static void main(String[] args) {
        new PersonDirector(new PersonThinBuilder()).createPerson();
        new PersonDirector(new PersonFatBuilder()).createPerson();
    } // main

} // Client
