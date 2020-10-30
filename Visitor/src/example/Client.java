package example;

public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        // 在对象结构中加入要对比的"男人"和"女人"
        o.attach(new Man());
        o.attach(new Woman());

        // 成功时的反应
        o.display(new Success());
        // 失败时的反应
        o.display(new Failing());
        // 恋爱时的反应
        o.display(new Amativeness());
        // 结婚时的反应
        o.display(new Marriage());
    } // main

} // Client
