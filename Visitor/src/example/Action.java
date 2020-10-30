package example;

/**
 * 状态
 */
public interface Action {
    // 得到男人结论或反应
    void getManConclusion(Man element);

    // 得到女人结论或反应
    void getWomanConclusion(Woman element);
} // Action
