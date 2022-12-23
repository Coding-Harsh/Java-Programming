package Linkedlist;

public class linkedlist {
    
    public static class Node { 
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;


       public  void addFirst(int data){

        Node newnode = new Node(data);
         size++;
        if(head == null){

            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

       }

       public void addLast(int data)
       
       {
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        size++;
        tail.next = newnode;
        tail = newnode;

       }

       public void print(){  // O(n) time complexity
         
        Node temp = head;
        if(head==null){
            System.out.println("LL is empty");
        }

        while(temp!=null){
            System.out.print(temp.data+"-->"+" ");
            temp = temp.next;
        }
        System.out.println("Null");

       }

       public int removefirst(){
        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size --;
        return val;
       }

       public int removelast(){

        if ( size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){

            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
          for(int i = 0 ; i<size-2; i++){
  
             prev = prev.next;
          }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;

       }

       public int itrSearch(int key){  // O(n) time complexity

        Node temp = head;
        int i = 0 ;

        while(temp!=null){

            if(temp.data == key){
                return i;
            }

            temp = temp.next;
            i++;
        }

        // key not found
        return -1;

       }

       public int helper(Node head, int key){  // O(N) time complexity
         
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;

       } 

       public int recSearch(int key){
    
          return helper(head, key);

       }
        public static void main(String[] args) {
            
            linkedlist ll = new linkedlist();
          
            ll.addFirst(2);
          
            ll.addFirst(1);
        
            ll.addLast(3);
            
            ll.addLast(4);

            // ll.removefirst();
            ll.print();

            // ll.removelast();

            // ll.print();

            // System.out.println(size);

            System.out.println(ll.recSearch(2));
            System.out.println(ll.recSearch(4));
            System.out.println(ll.recSearch(19));


        }
}
