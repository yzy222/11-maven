package com.work;
/*编写一个Java应用程序，该程序中有两个类：Vehicle（用于刻画机动车）和User(主类)。具体要求如下：
（1） Vehicle类有double类型的变量speed，用于刻画机动车的速度，一个int类型变量power，用于刻画机动车的功率。
定义了setSpeed（int sp）方法，用于定义机动车的速度；定义了getSpeed（）方法，用于获取机动车的速度。
方法定义了setPower（int pw）方法，用于设置机动车的功率。定义了getPower（）方法，用于获取机动车的功率。
方法定义了speedUp（int s）方法，体现机动车有加速功能。定义了speedDown（int s）方法，体现机动车有减速功能。

*/
public class Vehicle {
    private double speed;
    private int power;

    public void speedUp(int s){
        System.out.println(speed+=s);
    }
    public void speedDown(int s){
        System.out.println(speed-=s);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
