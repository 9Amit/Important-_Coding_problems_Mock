// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    MyLinkedList ll=new MyLinkedList();
    ll.add(10);
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.display();
    ll.reverse();
    System.out.println();
    ll.display();
    ll.remove(10);
     ll.display();
    }
}
class MyLinkedList{
    int count=0;
    Node first;
    Node last;
    public int count(){
        return count;
    }
    public void add(Object ele){
        if(first==null){
            first=new Node(ele,null);
            last=first;
            count++;
            return;
        }
        last.next=new Node(ele,null);
        last=last.next;
        count++;
    }
    public void display(){
        Node curr=first;
        while(curr.next!=null){
            System.out.print(curr.ele+" ");
            curr=curr.next;
        }
        System.out.println(curr.ele);
    }
    public void reverse(){
        Node next=null;
        Node prev=null;
        Node curr=first;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        last=first;
        first=prev;
    }
    public void remove(Object ele){
       if(first==null)return;
       if(first.ele.equals(ele)){
           first=first.next;
           if(first==null)last=null;
           count--;
           return;
       }
       Node curr=first;
       while(curr.next!=null){
           if(curr.next.ele.equals(ele)){
               if(curr.next==last)
                 last=curr;
                curr.next=curr.next.next;
                count--;
                return;
           }
           curr=curr.next;
       }
    }
    
}
class Node{
    Node next;
    Object ele;
    Node(Object ele,Node next){
        this.ele=ele;
        this.next=next;
    }
}