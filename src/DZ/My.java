package DZ;

/**
 * Created by User-pc on 21.04.2015.
 */
public class My {
    private Node head;
    private int listCount;
    public My(){
        head=new Node(null);
        listCount=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        return listCount;
    }
    public void push(Object date){
        Node oldHead=head;
        head=new Node();
        head.date=date;
        head.next=oldHead;
        listCount ++;
    }
    public Object pop(){
        Object date=head.date;
        head=head.next;
        listCount --;
        return date;
    }


}
