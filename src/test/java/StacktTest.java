/**
 * @author chengchao
 * @time 2016/11/19
 * 栈测试
 */
import org.junit.Before;
import org.junit.Test;

public class StacktTest {
    Stack stack;

    @Before
    public void prepare(){
        stack = new Stack(5);
    }

    @Test
    public void test(){
        stack.add(1);
        stack.add(3);
        stack.add(5);
        stack.add(7);
        stack.add(9);
        stack.add(11);
        stack.printAll();
        System.out.println(stack.length());
        System.out.println(stack.popUp());
        stack.printAll();
        System.out.println(stack.length());
        stack.add(27);
        stack.printAll();
        stack.popUp();
        stack.printAll();
        stack.clear();
        stack.printAll();
    }
}
