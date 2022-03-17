package com.juhd.odka.酒店系统;

public class Hotel {
    Room[][] rooms;

    public Hotel() {
        rooms=new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i==0) {
                    rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                }
                else if(i==1){
                    rooms[i][j]=new Room((i+1)*100+j+1,"标准间",true);
                }
                else if(i==2){
                    rooms[i][j]=new Room((i+1)*100+j+1,"高级间",true);
                }
            }
        }
    }
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }
    public void order(int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setStatute(false);
    }

    public void exit (int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setStatute(true);
    }

}
