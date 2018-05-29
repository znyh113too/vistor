package vistor.vistor;

import vistor.element.Element;
import vistor.element.ElementA;
import vistor.element.ElementB;

/**
 * 访问者
 * 
 * @author xiezhengchao
 * @since 2018/4/17 18:16
 */
public interface Visitor {

    /**
     * 访问元素具体操作
     */
    void visit(ElementA elementA);

    void visit(ElementB elementB);

    /**
     * 抽象行为的入口
     */
    void go(Element element);

}
