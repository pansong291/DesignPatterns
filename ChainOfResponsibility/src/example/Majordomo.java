package example;

/**
 * 监理
 */
public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // 总监所能有的权限就是可准许下属一周内的假期
        if (request.getType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(name + ": " + request.getContent() + " 数量: " + request.getNumber() + " 被批准");
        } else if (superior != null) {
            // 其余的转到上级
            superior.requestApplications(request);
        }
    }
} // Majordomo
