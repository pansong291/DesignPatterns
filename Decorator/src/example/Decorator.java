package example;

/**
 * 这个是各种装饰的父类
 */
public class Decorator extends Person {
    private Person person;

    public void decorator(Person person) {
        this.person = person;
    } // decorator

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
} // Decorator
