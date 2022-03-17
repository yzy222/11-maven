package com.colletion.list.danlink;

public class DanLink {

    Node header=new Node();
    int size=0;
    //添加元素方法
    public void add (Object o){
        if (null==header){
            header.next=new Node(o,null);
            size++;
        }
        else {
            findLast(header).next=new Node(o,null);
            size++;
        }
    }
    //删除指定元素方法
    public void remove(Object o){

    }
    //修改某个元素方法
    public void modify(Object newo){

    }
    //查找某个元素方法
    public int find (Object o){
        return 1;
    }
    //查找链表末尾
    private Node findLast(Node node){
        if (null==node.next) return node;
        return findLast(node.next);
    }
    public int getSize(){
        return size;
    }
}
