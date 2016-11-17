/**
 * Created by CC on 2016/11/17.
 * 双链表
 */
class DoubleNode{
    public DoubleNode previous;
    public DoubleNode next;
    protected int data;
    DoubleNode(){

    }
    DoubleNode(int data){
        this.data = data;
    }
}
public class DoubleLinkedList {
    //头结点
    public DoubleNode first;
    //尾节点
    public DoubleNode last;
    //构造函数
    DoubleLinkedList(){
    }
    DoubleLinkedList(int first, int last){
        this.first.data = first;
        this.first.next = this.last;
        this.last.data = last;
    }
}
