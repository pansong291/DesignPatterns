package example;

/**
 * 经理
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // 经理所能有的权限就是可准许下属两天内的假期
        if (request.getType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name + ": " + request.getContent() + " 数量: " + request.getNumber() + " 被批准");
        } else if (superior != null) {
            // 其余的转到上级
            superior.requestApplications(request);
        }
    }
} // CommonManager
