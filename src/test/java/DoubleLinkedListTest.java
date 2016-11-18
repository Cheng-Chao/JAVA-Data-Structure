/**
 * @author chengchao
 * @time 2016/11/17
 * 双链表测试
 */
import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListTest {
    DoubleLinkedList doubleLinkedList;

    @Before
    public void prepare(){
        doubleLinkedList = new DoubleLinkedList();
    }

    @Test
    public void test(){
        doubleLinkedList.printAll();
        doubleLinkedList.addFromEnd(22);
        doubleLinkedList.printAll();
        doubleLinkedList.addFromStart(55);
        doubleLinkedList.printAll();
        doubleLinkedList.addFromEnd(77);
        doubleLinkedList.printAll();
        doubleLinkedList.addFromStart(99);
        doubleLinkedList.printAll();
        doubleLinkedList.addFromEnd(66);
        doubleLinkedList.printAll();
        System.out.println(doubleLinkedList.indexOf(22));
        System.out.println(doubleLinkedList.indexOf(55));
        System.out.println(doubleLinkedList.indexOf(77));
        System.out.println(doubleLinkedList.indexOf(99));
        System.out.println(doubleLinkedList.indexOf(66));
        System.out.println(doubleLinkedList.indexOf(100));
        System.out.println(doubleLinkedList.get(0));
        System.out.println(doubleLinkedList.get(1));
        System.out.println(doubleLinkedList.get(2));
        System.out.println(doubleLinkedList.get(3));
        System.out.println(doubleLinkedList.get(4));
        System.out.println(doubleLinkedList.get(100));
        doubleLinkedList.deleteFromStart();
        doubleLinkedList.printAll();
        doubleLinkedList.deleteFromEnd();
        doubleLinkedList.printAll();
    }
}
