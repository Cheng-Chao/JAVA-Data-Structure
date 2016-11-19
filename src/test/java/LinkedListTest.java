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
        linkedList.addFromEnd(1);
        linkedList.addFromEnd(2);
        linkedList.addFromEnd(3);
        linkedList.printAll();
        System.out.println("The LinkedList's length is " + linkedList.length());
        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.indexOf(2));
        System.out.println(linkedList.indexOf(3));
        System.out.println(linkedList.indexOf(4));
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(-5));
        System.out.println(linkedList.get(5));
        linkedList.printAll();
        linkedList.deleteFromEnd();
        linkedList.printAll();
        System.out.println("The LinkedList's length is " + linkedList.length());
        linkedList.deleteFromEnd();
        linkedList.printAll();
        System.out.println("The LinkedList's length is " + linkedList.length());
        linkedList.deleteFromEnd();
        linkedList.printAll();
        linkedList.deleteFromEnd();
        System.out.println("The LinkedList's length is " + linkedList.length());
        linkedList.addFromEnd(7);
        linkedList.printAll();
        linkedList.addFromStart(6);
        linkedList.printAll();
        linkedList.addFromStart(5);
        linkedList.printAll();
        linkedList.deleteFromStart();
        linkedList.printAll();
        linkedList.deleteFromStart();
        linkedList.printAll();
        linkedList.deleteFromStart();
        linkedList.printAll();
    }
}
