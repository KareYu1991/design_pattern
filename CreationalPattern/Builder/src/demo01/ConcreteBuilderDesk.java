package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:03 2021/5/23
 * @description 具体建造者 - 创建台式电脑
 */
public class ConcreteBuilderDesk extends AbstractBuilder {

    /**
     * 因为父类维护了产品的对象，直接对此对象进行赋值即可
     */

    @Override
    public void builderType() {
        computer.setType("台式");
    }

    @Override
    public void builderPrice() {
        computer.setPrice(3000.0);
    }

    @Override
    public void builderParts() {
        computer.setParts("酷睿i7-8400K Windows10");
    }
}
