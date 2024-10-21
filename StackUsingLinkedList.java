import java.util.*;
class Stack{
    private class Node{
        int data;
        Node next;
        Node(int data) {this.data = data;}
        }
        private Node top;
        private int size=0;
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next=top;
            top=newNode;
            size++;
        }
        public int pop(){
            if(top==null) return -1;
            int poppedData=top.data;
            top=top.next;
            size--;
            return poppedData;
        }
        public int top(){
            return(top==null)?-1:top.data;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return top==null;
        }
    }
    public class StackUsingLinkedList{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            Stack stack=new Stack();
            int q=sc.nextInt();

            while(q-- >0){
                int queryType=sc.nextInt();
                if(queryType==1) stack.push(sc.nextInt());
                else if(queryType==2) stack.push(sc.nextInt());
                else if(queryType==3) stack.push(sc.nextInt());
                else if(queryType==4) stack.push(sc.nextInt());
                else if(queryType==5) stack.push(sc.nextInt());
            }
            sc.close();
        }
    }

