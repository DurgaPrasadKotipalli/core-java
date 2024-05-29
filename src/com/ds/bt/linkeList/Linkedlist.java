package com.ds.bt.linkeList;


import java.util.concurrent.LinkedBlockingDeque;

public class Linkedlist {


    class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
        }
    }
    Node head;
    public static void main(String[] args) {

        Linkedlist l1 = new Linkedlist();

        //l1.add(5);
        //l1.add(10);
       // l1.add(15);
       // l1.add(40);

        Linkedlist l2 = new Linkedlist();
        l2.add(2);
        l2.add(3);
        l2.add(20);
        boolean isIdentical = compareList(l1, l2);
        if(isIdentical){
            System.out.println("Two lists are identical");
        }else{
            System.out.println("Two lists are not identical");
        }

        mergeLists(l1, l2);


    }


    public void add(Object data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }

       Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = n;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        if(head == null){
            return "[]";
        }else{
            sb.append("[");
            Linkedlist.Node current = head;
            while(current.next != null){
                sb.append(current.data+", ");
                current = current.next;
            }
            sb.append(current.data);
            sb.append("]");
        }
        return sb.toString();
    }

    public static boolean compareList(Linkedlist l1, Linkedlist l2){
        Node a = l1.head;
        Node b = l2.head;

        while(a != null & b != null){
            if(a.data != b.data){
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
    }

    public static void mergeLists(Linkedlist l1, Linkedlist l2){
        Node a = l1.head;
        Node b = l2.head;
        Linkedlist mergedList = new Linkedlist();
        Node result = null;
        while(a != null && b != null){

            Integer a1 = (Integer)a.data;
            Integer b1 = (Integer)b.data;
            if(a1.intValue() < b1.intValue()){
                mergedList.add(a.data);
                a = a.next;
            }else{
                mergedList.add(b.data);
                b = b.next;
            }
        }

        while(a != null ){
            mergedList.add(a.data);
            a = a.next;
        }
        while(b != null){
            mergedList.add(b.data);
            b = b.next;
        }

        System.out.println(mergedList);


    }


}
