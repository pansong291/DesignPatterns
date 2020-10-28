package example;

public class Client {
    public static void main(String[] args) {
        CommonManager jl = new CommonManager("经理");
        Majordomo zj = new Majordomo("总监");
        GeneralManager zjl = new GeneralManager("总经理");
        // 设置上级
        jl.setSuperior(zj);
        zj.setSuperior(zjl);

        Request request = new Request();
        request.setType("请假");
        request.setContent("小菜请假");
        request.setNumber(1);
        jl.requestApplications(request); // 客户端的申请都由经理发起

        Request request2 = new Request();
        request2.setType("请假");
        request2.setContent("小菜请假");
        request2.setNumber(4);
        jl.requestApplications(request2);

        Request request3 = new Request();
        request3.setType("加薪");
        request3.setContent("小菜请求加薪");
        request3.setNumber(500);
        jl.requestApplications(request3);

        Request request4 = new Request();
        request4.setType("加薪");
        request4.setContent("小菜请求加薪");
        request4.setNumber(1000);
        jl.requestApplications(request4);
    } // main

} // Client
