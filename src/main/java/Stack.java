/**
 * @author chengchao
 * @time 2016/11/19
 * 栈 -> 单链表实现
 */
public class Stack {
    //栈的大小
    public int size;
    //构造函数
    Stack(int data){
        this.size = data;
    }

    LinkedList linkedList = new LinkedList();

    /**
     * 入栈
     */
    public void add(int data){
        if(isFull()){
            System.out.println("Add failed!!!The Stack will overflow!!!");
        }
        else {
            linkedList.addFromStart(data);
        }
    }

    /**
     * 出栈
     */
    public int popUp(){
        if(this.isEmpty()){
            System.out.println("Popup failed!!!The Stack is empty now!!!");
            return -1;
        }else{
            int currentData = linkedList.first.data;
            linkedList.deleteFromStart();
            return  currentData;
        }
    }

    /**
     * 判断是否是空栈
     */
    public boolean isEmpty(){
        boolean result = false;
        if(linkedList.first == null){
            result = true;
        }
        return  result;
    }

    /**
     * 判断是否是满栈
     */
    public boolean isFull(){
        boolean result = false;
        if(linkedList.length() == this.size){
            result = true;
        }
        return result;
    }

    /**
     * 输出所有栈数据
     */
    public void printAll(){
        if(this.isEmpty()){
            System.out.println("The Satck is Empty.");
        }
        else {
            linkedList.printAll();
        }
    }

    /**
     * 栈的当前数据个数
     */
    public int length(){
        return linkedList.length();
    }

    /**
     * 清空栈
     */
    public void clear(){
        linkedList.clear();
    }
}
