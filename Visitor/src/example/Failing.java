package example;

/**
 * 失败状态
 */
public class Failing implements Action {

    @Override
    public void getManConclusion(Man element) {
        System.out.println(element.getType() + getType() +
                "时, 闷头喝酒, 谁也不用劝.");
    }

    @Override
    public void getWomanConclusion(Woman element) {
        System.out.println(element.getType() + getType() +
                "时, 眼泪汪汪, 谁也劝不了.");
    }

    public String getType() {
        return "失败";
    } // getType
} // Failing
