package example;

/**
 * 美国
 */
public class USA extends Country {
    public USA(UnitedNation mediator) {
        super(mediator);
    }

    public void declare(String message) {
        unitedNation.declare(message, this);
    } // declare

    public void getMessage(String message) {
        System.out.println("美国获得对方消息: " + message);
    } // getMessage
} // USA
