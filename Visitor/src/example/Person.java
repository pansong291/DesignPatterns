package example;

public interface Person {
    // 接受, 用来获得 '状态' 对象
    void accept(Action visitor);
} // Person
