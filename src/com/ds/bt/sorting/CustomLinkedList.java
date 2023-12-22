package com.ds.bt.sorting;

public class CustomLinkedList {
    Node head = null;
    public static void main(String[] args){
        CustomLinkedList list = new CustomLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addBeforeHead(5);
        list.addAfterGivenElement(20, 25);
        list.add(40);
        list.addBeforeGivenNode(50, 35);
        System.out.println(list);
        System.out.println(list.contains(list.head, 30));


    }

    class Node
    {
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
        }
    }



    public void add(Object object){

        Node n = new Node(object);
        if(head == null){
            head = n;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = n;
        }
    }

    public void addBeforeHead(Object obj){
        Node n = new Node(obj);
        if(head == null){
            head = n;
        }else{
            Node temp = head;
            head = n;
            head.next = temp;
        }
    }

    public void addAfterGivenElement(Object prev_data, Object new_data){
        CustomLinkedList cl = new CustomLinkedList();
        if(!cl.contains(head, prev_data)){
            System.out.println("Element "+prev_data+" is not present in the list ");
            return;
        }
        if(head == null){
            System.out.println("head cannot be null");
            return;
        }
        if(head != null){
            Node current = head;
            while(current.next != null){
                if(current.data.equals(prev_data)){
                    Node new_node = new Node(new_data);
                    Node nxt = current.next;
                    current.next = new_node;
                    new_node.next = nxt;
                    return;
                }else{
                    current = current.next;
                }
            }
        }
    }


    public void addBeforeGivenNode(Object element, Object new_data){
        if(head == null){
            System.out.println("head cannot be null");
            return;
        }
        CustomLinkedList cl = new CustomLinkedList();
        if(!cl.contains(head, element)){
            System.out.println("element "+element+" is not present in the list");
            return;
        }

        if(head != null){
            Node current = head;
            while(current.next != null){
                if(current.next.data.equals(element)){
                     Node nxt = current.next;
                     Node temp = new Node(new_data);
                     current.next = temp;
                     temp.next = nxt;
                     return;
                }else{
                    current = current.next;
                }
            }
        }


    }


    public boolean contains(Node head, Object element){
        Node current = head;
        while(current != null){
            if(current.data.equals(element)){
                return true;
            }
            else{
                current = current.next;
            }

        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if(head == null){
            return "[]";
        }else{
            sb.append("[");
            Node current = head;
            while(current.next != null){
                sb.append(current.data+", ");
                current = current.next;
            }
            sb.append(current.data);
            sb.append("]");
        }
        return sb.toString();
    }
}
