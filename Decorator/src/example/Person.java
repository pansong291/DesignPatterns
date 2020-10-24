package example;

/**
 * 这个是要被装饰的 Person
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.print(name + ", 原外观");
    } // show
} // Person
