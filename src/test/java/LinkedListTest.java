/**
 * @Author chengchao
 * @Time 13/11/2016
 * @Basic LinkedList测试
 */
import  org.junit.Before;
import  org.junit.Test;
public class LinkedListTest {
    LinkedList linkedList;

    @Before
    public void prepare(){
        linkedList = new LinkedList();
    }

    @Test
    public void  test(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.indexOf(2));
        System.out.println(linkedList.indexOf(3));
        System.out.println(linkedList.indexOf(4));
        linkedList.printAll();
        linkedList.delete();
        linkedList.printAll();
        linkedList.delete();
        linkedList.printAll();
        linkedList.delete();
        linkedList.printAll();
        linkedList.delete();
        linkedList.add(544);
        linkedList.printAll();
    }
}
