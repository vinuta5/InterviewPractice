package com.interviewasked;

import java.util.*;
public class Solution{
    static class LinkedListNode{
        int val;
        LinkedListNode next;
        LinkedListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    static LinkedListNode head = null;
     //add Node at last
     static void addLinkedListNodeLast(int elem){
         LinkedListNode newNode = new LinkedListNode(elem);
         if(head == null) {
             head = newNode;
             return;
         }
         LinkedListNode curr = head;
         while(curr.next != null){
             curr = curr.next;
         }
         curr = newNode;
     }
        //add Node at first
    static void addLinkedListFirst(int elem){
        LinkedListNode newNode = new LinkedListNode(elem);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add at a position // 2->4->5
    static void addAtLocation(int elem, int index){
        if(head == null){
            head = new LinkedListNode(elem);
            return;
        }
        if(index == 0){
            addLinkedListFirst(elem);
            return;
        }
        LinkedListNode newNode = new LinkedListNode(elem);
        LinkedListNode curr = head, prev = head;
        int pos = 0;
        while(curr != null){
            if(pos == index){
                LinkedListNode temp = prev.next;
                prev.next = newNode;
                newNode.next = temp;
                break;
            }
            prev = curr;
            curr = curr.next;
            pos ++;
        }
    }
        //remove node at last
        static void removeElemFromLast(){
            if(head == null) return;
            if(head.next == null) {
                head = null;
                return;
            }
            LinkedListNode curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr = null;
        }
        
        //remove node at first
        static void removeElemFromFirst(){
            if(head == null) return;
            LinkedListNode curr = head;
            curr = curr.next;
            head = curr;
        }
        //remove element from an index // 4->5->6
        static LinkedListNode removeElementInBetween(int index){
            if(head == null) return head;
            if(index == 0) {
                removeElemFromFirst();
                return head;
            }
            LinkedListNode curr = head,prev = head;
            int pos = 0;
            while(curr != null){
                if(pos == index){
                    prev.next = curr.next;
                    break;
                }
                prev = curr;
                curr = curr.next;
                pos ++;
            }
            return head;
            
        }
        static void printHead(LinkedListNode head){
            LinkedListNode curr = head;
            while(curr != null){
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
        }
        
    public static void main(String [] args) throws Exception{
        System.out.println("addLinkedListNodeLast");
       addLinkedListNodeLast(10);
       printHead(head);
       System.out.println("\naddLinkedListFirst");
       addLinkedListFirst(5);
       printHead(head);
        System.out.println("\naddAtLocation");
       addAtLocation(8,1);
       printHead(head);
       System.out.println("\nremoveElementInBetween");
       removeElementInBetween(1);
       printHead(head);
       System.out.println("\nremoveElemFromFirst");
       removeElemFromFirst();
       printHead(head);
       System.out.println("\nremoveElemFromLast");
       removeElemFromLast();
       printHead(head);
       
       
       
    }
}