package example;

/**
 * 结婚状态
 */
public class Marriage implements Action {

    @Override
    public void getManConclusion(Man element) {
        System.out.println(element.getType() + getType() +
                "时, 感慨道: 恋爱游戏结束时, 有妻徒刑遥无期.");
    }

    @Override
    public void getWomanConclusion(Woman element) {
        System.out.println(element.getType() + getType() +
                "时, 欣慰曰: 爱情长跑路漫漫, 婚姻保险保平安.");
    }

    public String getType() {
        return "结婚";
    } // getType
} // Failing
