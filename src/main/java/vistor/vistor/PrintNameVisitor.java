package vistor.vistor;

import vistor.element.Element;
import vistor.element.ElementA;
import vistor.element.ElementB;

/**
 * 提供打印名字的访问者
 * 
 * @author xiezhengchao
 * @since 2018/4/17 18:17
 */
public class PrintNameVisitor implements Visitor {

    /**
     * 行为入口，由element触发
     */
    @Override
    public void go(Element element) {
        // 直接去accept触发visit到我们自己的行为实现
        element.accept(this);
    }

    /**
     * 从不同的元素中获取信息 name()
     */
    @Override
    public void visit(ElementA elementA) {
        print(elementA.name());
    }

    /**
     * 从不同的元素中获取信息 name()
     */
    @Override
    public void visit(ElementB elementB) {
        print(elementB.name());
    }

    /**
     * 比如这是统一的处理方法流程
     */
    private void print(String str) {
        System.out.println(str);
    }
}
