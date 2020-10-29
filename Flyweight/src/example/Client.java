package example;

/**
 * 享元模式
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite x = f.getWebSiteCategory("产品展示");
        x.use(new User("小菜"));

        WebSite y = f.getWebSiteCategory("产品展示");
        y.use(new User("大鸟"));

        WebSite z = f.getWebSiteCategory("产品展示");
        z.use(new User("娇娇"));

        WebSite l = f.getWebSiteCategory("博客");
        l.use(new User("老顽童"));

        WebSite m = f.getWebSiteCategory("博客");
        m.use(new User("桃谷六仙"));

        WebSite n = f.getWebSiteCategory("博客");
        n.use(new User("南海鳄神"));

        System.out.println("网站分类总数为: " + f.getWebSiteCount());
    } // main

} // Client
