package example;

/**
 * 原型模式
 */
public class Client {
    public static void main(String[] args) {

        try {
            Resume a = new Resume("大鸟");
            a.setPersonalInfo("男", "29");
            a.setWorkExperience("1998-2000", "XX 公司");
            Resume b = (Resume) a.clone();
            b.setWorkExperience("1998-2006", "YY 企业");
            Resume c = (Resume) a.clone();
            c.setPersonalInfo("男", "24");
            a.display();
            b.display();
            c.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    } // main

} // Client
