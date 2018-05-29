package vistor.element;

import vistor.vistor.Visitor;

/**
 * 让所有元素都有相同的行为，和模版方法是彻底不同的思路实现，这个模式明显更屌
 *
 * @author xiezhengchao
 * @since 2018/4/17 18:32
 */
public abstract class AbstractElement implements Element {

    private Visitor visitor;

    public AbstractElement(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void go() {
        // 将抽象出去的行为 委托给访问者完成
        visitor.go(this);
    }

    public void changeVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
}
