package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:04 2021/5/23
 * @description 具体建造者 - 创建笔记本电脑
 */
public class ConcreteBuilderLaptop extends AbstractBuilder {

    /**
     * 因为父类维护了产品的对象，直接对此对象进行赋值即可
     */

    @Override
    public void builderType() {
        computer.setType("笔记本");
    }

    @Override
    public void builderPrice() {
        computer.setPrice(5000.0);
    }

    @Override
    public void builderParts() {
        computer.setParts("AMD线程撕裂者 Windows10");
    }
}
