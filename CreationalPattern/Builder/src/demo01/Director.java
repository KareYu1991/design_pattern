package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:07 2021/5/23
 * @description 指挥者
 */
public class Director {

    private AbstractBuilder abstractBuilder;

    public Director(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    /**
     * 指挥建造者创建产品
     *
     * @return
     */
    public Computer construct() {
        abstractBuilder.builderType();
        abstractBuilder.builderPrice();
        abstractBuilder.builderParts();
        Computer computer = abstractBuilder.getComputer();
        return computer;
    }
}
