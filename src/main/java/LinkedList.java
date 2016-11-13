/**
 * @Author chengchao
 * @Time 13/11/2016
 * @Basic LinkedList
 */
class Node{
    protected Node next;
    public int data;

    public Node(int data) {
        this.data = data;
    }

}
public class LinkedList {
    //头结点
    public Node first;

    //构造函数
    public LinkedList(){
        this.first = null;
    }

    //添加节点
    public void add(int data){
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

    //删除节点
    public void delete(){
        if(this.first == null){
            System.out.println("Delete failed!!!The Linkedlist is empty");
            return;
        }
        else {
            Node current = this.first;
            Node next = current.next;
            //第二个为空 直接删除第一个节点返回
            if(next == null){
                this.first = null;
                return;
            }
            //第三个为空 直接删除第二个节点返回
            else {
                next = next.next;
                if(next == null){
                    this.first.next = null;
                    return;
                }
            }
            //前三个都不为空
            Node lastPrevious = this.first.next;//第二个节点
            Node previous= this.first.next.next;//第三个节点
            next = previous.next;//第四个节点
            while(next != null){
                lastPrevious = previous;
                previous = next;
                next = next.next;
            }
            lastPrevious.next = null;
            return;
        }
    }

    //输出所有节点
    public void printAll(){
        if(this.first == null){
            System.out.println("The Linkedlist is empty.");
            return;
        }
        else{
            Node current = this.first;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    /**
     * @param data
     * @return 不存在则返回-1;存在则范湖第一次出现的位置;
     */
    public int indexOf(int data){
        Node current = this.first;
        int index = 0;
        boolean isFound = false;
        while(current != null){
            if(current.data == data){
                isFound = true;
                break;
            }
            current = current.next;
            index += 1;
        }
        if(isFound) return index;
        else return  -1;
    }
}
