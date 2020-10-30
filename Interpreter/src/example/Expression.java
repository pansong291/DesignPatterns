package example;

public abstract class Expression {
    /**
     * 解释器
     *
     * @param context
     */
    public void interpret(PlayContext context) {
        String text = context.getText();
        if (text.length() == 0) {
            return;
        }
        // O 3 E 0.5 G 0.5 A 3
        // O
        String playKey = text.substring(0, 1);
        // 3 E 0.5 G 0.5 A 3
        text = text.substring(2);
        // 3
        double playValue = Double.parseDouble(text.substring(0, text.indexOf(" ")));
        // E 0.5 G 0.5 A 3
        context.setText(text.substring(text.indexOf(" ") + 1));

        // O, 3
        execute(playKey, playValue);
    } // interpret

    /**
     * 执行, 不同的文法子类有不同的执行处理
     *
     * @param key
     * @param value
     */
    public abstract void execute(String key, double value);
} // Expression
