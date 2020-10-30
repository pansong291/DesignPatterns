package example;

/**
 * 恋爱状态
 */
public class Amativeness implements Action {

    @Override
    public void getManConclusion(Man element) {
        System.out.println(element.getType() + getType() +
                "时, 凡事不懂也要装懂.");
    }

    @Override
    public void getWomanConclusion(Woman element) {
        System.out.println(element.getType() + getType() +
                "时, 遇事懂也装作不懂.");
    }

    public String getType() {
        return "恋爱";
    } // getType
} // Amativeness
