import java.util.*;
public class MiddleElement {
   static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
        public int middleElement()
        {
            SinglyLinkedListNode n=this.head;
            int c=0,i=0;
            while(n!=null)
            {
                n=n.next;
                c++;
            }
            i=(c%2==0)?c/2:c/2;
            n=this.head;
            while(i>0)
            {
                n=n.next;
                i--;
            }
            return n.data;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n[]=s.split(" ");
        int a[]=new int[n.length];
        SinglyLinkedList l=new SinglyLinkedList();
        for(int i=0;i<n.length;i++)
        {
            l.insertNode(Integer.parseInt(n[i]));
            
        }
        System.out.println(l.middleElement());
    }
}
