package com.britetech.practice2;

import java.util.Random;

public class Linkedlist {
    Node head = null;
    Node tail = null;

    public void insertData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextRef(newNode);
            tail = newNode;
            tail.setNextRef(null);
        }
    }

    public void deleteData(int data) {
        if (head == null) {
            System.out.println("No node found with data");
            return;
        }
        if (head != null && head.getData() == data) {
            Node tempNode = head;
            head = tempNode.getNextRef();

        } else {
            Node previousNode = head;
            Node dataFoundNode = null;
            Node tempNode = head.getNextRef();
            while (tempNode != null) {
                if (tempNode.getData() == data) {
                    dataFoundNode = tempNode;
                    break;
                } else {
                    previousNode = tempNode;
                    tempNode = tempNode.getNextRef();
                }
            }
            if (dataFoundNode ==null ){
                System.out.println("\n No Data found ");
                return;
            }
            if (dataFoundNode != null && dataFoundNode.getNextRef() == null) {
                previousNode.setNextRef(null);
                tail = previousNode;
            } else {
                previousNode.setNextRef(dataFoundNode.getNextRef());
                dataFoundNode.setNextRef(null);
            }
        }

    }

    public void traverse() {
        if (head == null) {
            System.out.println("No Data Found");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(" " + tempNode.getData());
                tempNode = tempNode.getNextRef();
            }


        }
    }

    public void reverselinkedlist(){
        Node currentNode = head;
        Node nextNode = null;
        Node previousNode = null;
        while (currentNode!=null){
            nextNode = currentNode.getNextRef();
          currentNode.setNextRef(previousNode);
          previousNode = currentNode;
          currentNode = nextNode;
        }
        head = previousNode;
    }

    public static void main(String[] args) {
        Linkedlist ls = new Linkedlist();
        Random rr = new Random();

        for (int i = 0; i < 20; i++) {
            ls.insertData(i);
        }

       // ls.traverse();
        System.out.println();
        ls.traverse();
        ls.deleteData(20);
        System.out.println();
        ls.reverselinkedlist();
        ls.traverse();

    }
}
