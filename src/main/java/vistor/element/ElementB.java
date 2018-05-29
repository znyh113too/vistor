package vistor.element;

import vistor.vistor.Visitor;

/**
 * @author xiezhengchao
 * @since 2018/4/17 18:20
 */
public class ElementB extends AbstractElement {

    private String name = "I am B";

    public ElementB(Visitor visitor) {
        super(visitor);
    }

    @Override
    public void accept(Visitor visitor) {
        // 注意这个this已经变为了ElementB实例
        visitor.visit(this);
    }

    public String name() {
        return name;
    }

    public void appendName(String suffix) {
        this.name = name + "." + suffix;
    }
}
