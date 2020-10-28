package example;

public class Client {

    public static void main(String[] args) {
        Player bd = new Forward("巴蒂尔");
        bd.attack();
        Player mk = new Guard("麦克格雷迪");
        mk.attack();
        Player ym = new Translator("姚明");
        /*
         * 翻译者告诉姚明, 教练要求你既要 '进攻' 又要 '防守'
         */
        ym.attack();
        ym.defense();
    } // main

} // Client
