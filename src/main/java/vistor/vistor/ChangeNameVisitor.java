package vistor.vistor;

import java.time.LocalDateTime;

import vistor.element.Element;
import vistor.element.ElementA;
import vistor.element.ElementB;

/**
 * 会修改名字的访问者
 * 
 * @author xiezhengchao
 * @since 2018/4/17 18:17
 */
public class ChangeNameVisitor implements Visitor {

    /**
     * 行为入口，由element触发
     */
    @Override
    public void go(Element element) {
        // 直接去accept触发visit到我们自己的行为实现
        element.accept(this);
    }

    @Override
    public void visit(ElementA elementA) {
        elementA.appendName("append A now()" + LocalDateTime.now());
    }

    @Override
    public void visit(ElementB elementB) {
        elementB.appendName("append B now()" + LocalDateTime.now());
    }

}
