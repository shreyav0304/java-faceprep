import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;   
    private Node rear;    
    private int size;     
    
    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    public int dequeue() {
        if (front == null) {
            return -1;  
        }
        int dequeuedData = front.data;
        front = front.next;
        
        if (front == null) {  
            rear = null;
        }
        size--;
        return dequeuedData;
    }
    
    public int front() {
        if (front == null) {
            return -1; 
        }
        return front.data;
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
}

public class LinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int q = Integer.parseInt(br.readLine());
        
        Queue queue = new Queue();
        
        for (int i = 0; i < q; i++) {
            String[] input = br.readLine().split(" ");
            int queryType = Integer.parseInt(input[0]);
            
            switch (queryType) {
                case 1:
                    int data = Integer.parseInt(input[1]);
                    queue.enqueue(data);
                    break;
                case 2:
                    output.append(queue.dequeue()).append("\n");
                    break;
                case 3:
                    output.append(queue.front()).append("\n");
                    break;
                case 4:
                    output.append(queue.getSize()).append("\n");
                    break;
                case 5:
                    output.append(queue.isEmpty() ? "true" : "false").append("\n");
                    break;
            }
        }
        
        System.out.print(output.toString());
    }
}
