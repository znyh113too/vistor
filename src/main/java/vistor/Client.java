package vistor;

import vistor.element.ElementA;
import vistor.element.ElementB;
import vistor.vistor.ChangeNameVisitor;
import vistor.vistor.PrintNameVisitor;
import vistor.vistor.Visitor;

/**
 * 访问者模式 1分离数据和行为 2存在着相似的操作，避免重复代码
 *
 * @author xiezhengchao
 * @since 2018/4/17 18:20
 */
public class Client {

    public static void main(String[] args) {

        Visitor printNameVisitor = new PrintNameVisitor();
        Visitor changeNameVisitor = new ChangeNameVisitor();

        // 通过访问者模式将数据和行为剥离，这看起来相当的明显，虽然还是调用的Element的方法，但是实际上方法是在访问者中进行，数据在元素中存储
        ElementA elementA = new ElementA(printNameVisitor);
        ElementB elementB = new ElementB(printNameVisitor);

        // 这里先用打印的访问者,打印一下名字
        elementA.go();
        elementB.go();

        // 更换访问者,重新访问,这里访问者会将元素的名称改变
        elementA.changeVisitor(changeNameVisitor);
        elementB.changeVisitor(changeNameVisitor);
        elementA.go();
        elementB.go();

        // 重新切回打印名称访问者,观察变化
        elementA.changeVisitor(printNameVisitor);
        elementB.changeVisitor(printNameVisitor);
        elementA.go();
        elementB.go();
    }

}
