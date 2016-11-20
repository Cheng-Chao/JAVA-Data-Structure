import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author chengchao
 * @time 2016/11/20
 * 队测试
 */
public class QueueTest {
    Queue queue;

    @Before
    public void prepare(){
        queue = new Queue(5);
    }

    @Test
    public void test(){
        System.out.println(queue.length());
        queue.dequeue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.printAll();
        //Assert.assertEquals(queue.length(),5);
        System.out.println(queue.length());
        System.out.println(queue.dequeue());
        queue.printAll();
        queue.clear();
        queue.printAll();
    }
}
