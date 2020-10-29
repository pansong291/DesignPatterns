package flyweight;

import java.util.HashMap;

/**
 * 享元工厂, 用来创建并管理 Flyweight 对象.
 * 它主要是用来确保合理地共享 Flyweight,
 * 当用户请求一个 Flyweight 时, FlyweightFactory
 * 对象提供一个已创建的实例或者创建一个 (如果不存在的话)
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        // 初始化时, 先生成三个实例
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    /**
     * 根据客户端请求, 获得已生成的实例
     *
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight();
            flyweights.put(key, flyweight);
        }
        return flyweight;
    } // getFlyweight
} // FlyweightFactory
