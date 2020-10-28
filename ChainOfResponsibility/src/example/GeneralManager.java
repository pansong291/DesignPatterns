package example;

/**
 * 总经理
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // 总经理可准许下属任意天的假期
        if (request.getType().equals("请假")) {
            System.out.println(name + ": " + request.getContent() + " 数量: " + request.getNumber() + " 被批准");
        }else if (request.getType().equals("加薪")&&request.getNumber()<=500) {
            // 加薪在 500 以内, 没有问题
            System.out.println(name + ": " + request.getContent() + " 数量: " + request.getNumber() + " 被批准");
        } else {
            // 超过 500, 就要考虑一下了
            System.out.println(name + ": " + request.getContent() + " 数量: " + request.getNumber() + " 再说吧");
        }
    }
} // GeneralManager
