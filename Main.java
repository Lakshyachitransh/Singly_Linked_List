package com.company;

import com.company.Singly_Linked_List.Link_Node;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //storing 4->5->6->7->10->12
        Link_Node Head=new Link_Node(4);
        Link_Node first=new Link_Node(5);
        Link_Node second=new Link_Node(6);
        Link_Node third=new Link_Node(7);
        Link_Node fourth=new Link_Node(10);
        Link_Node fifth=new Link_Node(12);
        Head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;
        Singly_Linked_List singly_linked_list=new Singly_Linked_List();
        singly_linked_list.display(Head);
    }
}
