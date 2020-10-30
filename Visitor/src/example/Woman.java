package example;

/**
 * 女人
 */
public class Woman implements Person {
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }

    public String getType() {
        return "女人";
    } // getType
} // Woman
