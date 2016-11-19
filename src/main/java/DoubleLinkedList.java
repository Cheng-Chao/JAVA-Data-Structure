/**
 * @author chengchao
 * @time 2016/11/17
 * 双链表
 */
class DoubleNode{
    public DoubleNode previous;
    public DoubleNode next;
    public int data;
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
        this.first = new DoubleNode(first);
        this.last = new DoubleNode(last);
        this.first.next = this.last;
    }
    /**
     * 从头部添加节点
     */
    public void addFromStart(int data){
        DoubleNode doubleNode = new DoubleNode(data);
        if(this.first == null){
            this.first = doubleNode;
            this.first.next = this.last;
        }
        else {
            DoubleNode currentFirst = this.first;
            this.first = doubleNode;
            if(this.last == null){
                this.last = currentFirst;
                this.first.next = this.last;
            }
            else {
                this.first.next = currentFirst;
                currentFirst.previous = this.first;
            }
        }
    }

    /**
     * 从尾部添加节点
     */
    public void addFromEnd(int data){
        if(this.last == null && this.first == null){
            addFromStart(data);
        }
        else{
            DoubleNode doubleNode = new DoubleNode(data);
            DoubleNode currentLast = this.last;
            this.last = doubleNode;
            currentLast.next = this.last;
            this.last.previous = currentLast;
        }
    }

    /**
     * 从头部删除节点
     */
    public void deleteFromStart(){
        //第一个节点为空 无法删除
        if(this.first == null){
            System.out.println("Delete failed!!!The DoubleLinkedlist is empty");
        }
        else{
            DoubleNode second = this.first.next;
            //第二个为空 直接删除头结点返回
            if(second== null){
                this.first = null;
                return;
            }
            //第二个节点不为空，直接删除头结点
            else{
                this.first = second;
            }
        }
    }

    /**
     * 从尾部删除节点
     */
    public void deleteFromEnd(){
        //第一个节点为空 无法删除
        if(this.first == null){
            System.out.println("Delete failed!!!The DoubleLinkedlist is empty");
        }
        else{
            DoubleNode current = this.first;
            DoubleNode currentLast = null;
            while(current != null){
                currentLast = current;
                current = current.next;
            }
            //删除最后一个节点
            currentLast.previous.next = null;
        }
    }

    /**
     * 输出所有节点
     */
    public void printAll(){
        if(this.first == null){
            System.out.println("The DoubleLinkedlist is empty.");
            return;
        }
        else{
            DoubleNode current = this.first;
            while(current != null){
                System.out.print(current.data);
                System.out.print(" ");
                current = current.next;
            }
            System.out.print("\n");
        }
    }

    /**
     * @param data
     * @return 不存在则返回-1;存在则返回第一次出现的位置;
     */
    public int indexOf(int data){
        DoubleNode current = this.first;
        int index = 0;
        boolean exist = false;
        while(current != null){
            if(current.data == data){
                exist = true;
                break;
            }
            current = current.next;
            index += 1;
        }
        if(exist) return index;
        else return  -1;
    }

    /**
     * @get 返回当前index的值,找不到返回null
     */
    public int get(int i){
        DoubleNode current = this.first;
        Integer result = null;
        int index = 0;
        while(current != null){
            if(index == i){
                result = current.data;
                break;
            }
            current = current.next;
            index += 1;
        }
        //返回null 遗留问题...
        return result == null? Integer.MIN_VALUE : result;
    }

    /**
     * 获取双链表当前长度
     */
    public int length(){
        int count = 0;
        DoubleNode current = this.first;
        while(current != null){
            count += 1;
            current = current.next;
        }
        return count;
    }
}
