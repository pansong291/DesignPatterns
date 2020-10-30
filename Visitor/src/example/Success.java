package example;

/**
 * 成功状态
 */
public class Success implements Action {

    @Override
    public void getManConclusion(Man element) {
        System.out.println(element.getType() + getType() +
                "时, 背后多半有一个伟大的女人.");
    }

    @Override
    public void getWomanConclusion(Woman element) {
        System.out.println(element.getType() + getType() +
                "时, 背后大多有一个不成功的男人.");
    }

    public String getType() {
        return "成功";
    } // getType
} // Success
