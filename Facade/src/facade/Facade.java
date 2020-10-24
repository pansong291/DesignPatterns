package facade;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    } // Facade

    public void methodA() {
        System.out.println("\n方法组A()");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    } // methodA

    public void methodB() {
        System.out.println("\n方法组B()");
        two.methodTwo();
        three.methodThree();
    } // methodB

} // Facade
