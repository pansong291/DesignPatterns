package example;

/**
 * 伊拉克
 */
public class Iraq extends Country {
    public Iraq(UnitedNation mediator) {
        super(mediator);
    }

    public void declare(String message) {
        unitedNation.declare(message, this);
    } // declare

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息: " + message);
    } // getMessage
} // Iraq
