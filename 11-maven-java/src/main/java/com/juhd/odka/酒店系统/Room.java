package com.juhd.odka.酒店系统;

public class Room {

    private int no;
    private String type;
    private boolean statute;

    public Room() {
        System.out.println("1111111111");
    }

    public Room(int no, String type, boolean statute) {
        this.no = no;
        this.type = type;
        this.statute = statute;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatute() {
        return statute;
    }

    public void setStatute(boolean statute) {
        this.statute = statute;
    }

    public String toString (){
        return this.no+"/"+this.type+"/"+(this.statute ? "空闲":"占用")+"   ";
    }
}
