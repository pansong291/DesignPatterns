package chainofresponsibility;

public abstract class Handler {
protected Handler successor;

    /**
     * 设置继任者
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract void handleRequest(int request);
} // Handler
