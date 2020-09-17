package com.company;

public class Singly_Linked_List {
    protected Link_Node Head;
    public void display(Link_Node Head){
        if (Head==null){
            return;
        }
        Link_Node current=Head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print(current);
    }
    protected static class Link_Node{
        private int data;
        protected Link_Node next;

        public Link_Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
}
