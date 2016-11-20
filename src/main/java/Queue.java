/**
 * @author  chengchao
 * @time 2016/11/20
 * 队列 -> 单链表实现
 */
public class Queue {
    //队列大小
    public int size;
    //构造函数
    Queue(int data){
        this.size = data;
    }

    LinkedList linkedList = new LinkedList();

    /**
     * 入队
     */
    public void add(int data){
        if(isFull()){
            System.out.println("Add failed!!!The Queue will overflow!!!");
        }
        else {
            linkedList.addFromEnd(data);
        }
    }

    /**
     * 出队
     */
    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("DeQueue failed!!!The Queue is empty now!!!");
            return -1;
        }else{
            int currentData = linkedList.first.data;
            linkedList.deleteFromStart();
            return  currentData;
        }
    }

    /**
     * 判断是否是空队
     */
    public boolean isEmpty(){
        boolean result = false;
        if(linkedList.first == null){
            result = true;
        }
        return  result;
    }

    /**
     * 判断是否是满队
     */
    public boolean isFull(){
        boolean result = false;
        if(linkedList.length() == this.size){
            result = true;
        }
        return result;
    }

    /**
     * 输出所有队数据
     */
    public void printAll(){
        linkedList.printAll();
    }

    /**
     * 队的当前数据个数
     */
    public int length(){
        return linkedList.length();
    }
}
