package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 19:57 2021/5/23
 * @description 抽象建造者
 */
public abstract class AbstractBuilder {

    /**
     * 维护一个具体产品类型对象
     */
    protected Computer computer = new Computer();

    /**
     * 提供一个返回产品的方法
     *
     * @return
     */
    public Computer getComputer() {
        return computer;
    }

    /**
     * 建造产品的类型属性
     */
    public abstract void builderType();

    /**
     * 建造产品的价格属性
     */
    public abstract void builderPrice();

    /**
     * 建造产品的其他零件属性
     */
    public abstract void builderParts();
}
