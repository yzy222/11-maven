package com.work;
/*编写一个Java应用程序，该程序中有两个类：Box类和BoxTest (主类)。具体要求如下：
（1）定义一个描述长方体的类Box，类中有三个整型的成员变量：length、width和height，分别表示长方体的长、宽和高。
定义setInfo(int ,int ,int)方法设置这三个变量的值；
定义volumn()方法求长方体的体积并返回整型结果；
定义area()方法求长方体的表面积并返回整型结果；
定义toString()方法把长方体的长、宽、高，以及长方体的体积和表面积转化为字符串并返回字符串。
*/
public class Box {
    private int length;
    private int width;
    private int height;
    public String toString(){
        return "length:"+length+"\twidth:"+width+"\theight:"+height+"\tvolumn:"+volumn()+"\tarea:"+area();
    }

    public void setInfo(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public int volumn(){
        return length*width*height;
    }
    public int area(){
        return 2*(length*width+length*height+width*height);
    }
}
