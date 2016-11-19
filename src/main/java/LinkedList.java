/**
 * @author  chengchao
 * @time 2016/11/13
 * 单链表
 */
class Node{
    public Node next;
    public int data;

    Node(){
    }

    Node(int data) {
        this.data = data;
    }

}

/**
 * 单链表
 */
public class LinkedList {
    //头结点
    public Node first;

    //构造函数
    LinkedList(){
    }
    LinkedList(int data){
        this.first = new Node(data);
        this.first.next = null;
    }

    /**
     * 从头部添加节点
     */
    public void addFromStart(int data){
        Node node = new Node(data);
        if(this.first == null){
            this.first = node;
            this.first.next = null;
        }
        else{
            Node first = this.first;
            this.first = node;
            this.first.next = first;
        }
    }

    /**
     * 从尾部添加节点
     */
    public void addFromEnd(int data){
        Node node = new Node(data);
        if(this.first == null){
            this.first = node;
            this.first.next = null;
        }
        else{
            Node next = this.first;
            Node previous = null;
            while(next != null){
                previous = next;
                next = next.next;
            }
            previous.next = node;
            node.next = null;
        }
    }

    /**
     * 从头部删除节点
     */
    public void deleteFromStart(){
        //第一个节点为空 无法删除
        if(this.first == null){
            System.out.println("Delete failed!!!The Linkedlist is empty");
        }
        else{
            Node secondNode = this.first.next;
            //第二个为空 直接删除头结点返回
            if(secondNode== null){
                this.first = null;
            }
            //第二个节点不为空，直接删除头结点
            else{
                this.first = secondNode;
            }
        }
    }

    /**
     * 从尾部删除节点
     */
    public void deleteFromEnd(){
        //第一个节点为空 无法删除
        if(this.first == null){
            System.out.println("Delete failed!!!The Linkedlist is empty");
        }
        else {
            Node secondNode = this.first.next;
            //第二个为空 直接删除头结点返回
            if(secondNode == null){
                this.first = null;
            }
            //第三个为空 直接删除第二个节点返回
            else {
                Node thirdNode = secondNode.next;
                if(thirdNode == null){
                    this.first.next = null;
                }
                else{
                    //前三个都不为空
                    Node lastPrevious = this.first.next;//第二个节点
                    Node previous= this.first.next.next;//第三个节点
                    Node next = previous.next;//第四个节点
                    while(next != null){
                        lastPrevious = previous;
                        previous = next;
                        next = next.next;
                    }
                    lastPrevious.next = null;
                }
            }
        }
    }

    /**
     * 输出所有节点
     */
    public void printAll(){
        if(this.first == null){
            System.out.println("The Linkedlist is empty.");
            return;
        }
        else{
            Node current = this.first;
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
        Node current = this.first;
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
        int index = 0;
        Integer result = null;
        Node current = this.first;
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
     * 获取链表当前长度
     */
    public int length(){
        int count = 0;
        Node current = this.first;
        while(current != null){
            count += 1;
            current = current.next;
        }
        return count;
    }
}
