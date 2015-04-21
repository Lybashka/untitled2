package DZ;

/**
 * Created by User-pc on 21.04.2015.
 */
public class Node {
    Object date;
    Node next;
    public Node(Object date_Value){
        date=date_Value;
        next=null;
    }
    public Node(Object date_Value,Node nextValue){
        date=date_Value;
        next=nextValue;
    }
    public Object getDate(){
        return date;
    }
    public Node getNext(){
        return next;
    }
    public void setDate(Object date_Value){
        date=date_Value;
    }
    public void setNext(Node nextValue){
        next=nextValue;
    }

    @Override
    public String toString() {
        return "Node{" +
                "date=" + date +
                ", next=" + next +
                '}';
    }
}
