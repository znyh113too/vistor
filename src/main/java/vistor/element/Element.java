package vistor.element;

import vistor.other.GoAble;
import vistor.vistor.Visitor;

/**
 * 待访问元素
 * 
 * @author xiezhengchao
 * @since 2018/4/17 18:17
 */
public interface Element extends GoAble {

    /**
     * 回调访问者，让访问者决定具体执行子对象的行为
     */
    void accept(Visitor visitor);

}
