package com.work;

/*1. 编写一个Java应用程序，该程序中有两个类：Circle类和TestCircle (主类)。具体要求如下：
（1）定义一个圆形类Circle，类中有一个用来描述半径的double型成员变量r，
定义setR()方法初始化半径；定义getR(double)方法获取半径；定义getArea()方法求圆形的面积并返回double类型结果；
定义getPerimeter()方法求圆形的周长并返回double类型结果。
*/
public class Circle {
    private  double r;

    public double getArea(){
        return r*r*3.14;
    }
    public double getPerimeter(){
        return r*2*3.14;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
