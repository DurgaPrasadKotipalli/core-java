package com.ds.bt.linkeList;

public class CustomLinkedList {
    Node head = null;
    public static void main(String[] args){
        CustomLinkedList list = new CustomLinkedList();
        list.add(10);
        list.add(10);
       // list.add(30);
        //list.addBeforeHead(5);
        //list.addAfterGivenNode(10, 25);
        //list.add(50);
        list.addBeforeGivenNode(10, 40);
        System.out.println(list);
        //System.out.println(list.contains(list.head, 30));
        //list.remove(50);
        System.out.println(list);
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

    public void addAfterGivenNode(Object given_data, Object new_data){
        CustomLinkedList cl = new CustomLinkedList();
        if(!cl.contains(head, given_data)){
            System.out.println("Element "+given_data+" is not present in the list ");
            return;
        }
        if(head == null){
            System.out.println("head cannot be null");
            return;
        }
        if(head != null){
            Node n = new Node(new_data);
            Node current = head;
            if(head.data.equals(given_data)){
                current.next = n;
                return;
            }
            while(current.next != null){
                if(current.data.equals(given_data)){
                    Node nxt = current.next;
                    current.next = n;
                    n.next = nxt;
                    return;
                }else{
                    current = current.next;
                }
            }
        }
    }


    public void addBeforeGivenNode(Object given_data, Object new_data){
        if(head == null){
            System.out.println("head cannot be null");
            return;
        }
        CustomLinkedList cl = new CustomLinkedList();
        if(!cl.contains(head, given_data)){
            System.out.println("element "+given_data+" is not present in the list");
            return;
        }

        if(head != null){
            Node n = new Node(new_data);
            Node current = head;
            if(head.data.equals(given_data)){
                head = n;
                head.next = current;
                //current.next = null;
                return;
            }

            while(current.next != null){
                if(current.next.data.equals(given_data)){
                     Node nxt = current.next;
                     Node temp = n;
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

    //10 -> 20 -> 30 -> 40 -> 50
    public void remove(Object obj) {//50
        Integer elementToBeremoved=(Integer)obj;
        if(head!=null) {
            Node temp=head;//50
            Node previous=null;
            Integer nodeData=(Integer)temp.data;
            if(nodeData.intValue()==elementToBeremoved.intValue()) {
                head=temp.next;
                temp.next=null;
                temp=null;
                return;
            }
            while(temp.next!=null) {
                nodeData=(Integer)temp.data;
                if(nodeData.intValue()==elementToBeremoved.intValue()) {
                    previous.next=temp.next;
                    temp.next=null;
                    temp=null;
                    return;
                }else {
                    previous=temp;//previous=30
                    temp=temp.next;//temp=50
                }
            }
            previous.next=null;
            temp=null;

        }
    }
}
