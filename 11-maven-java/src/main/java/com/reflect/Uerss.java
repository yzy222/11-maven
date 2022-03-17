package com.reflect;

public class Uerss extends A implements X,Y,Z{
    /*static {
        System.out.println(111);
    }*/
    int age;
    public String name;
    private double height;
    protected long phone;

    public Uerss(long phone) {
        this.phone = phone;
    }

    public Uerss(double height) {
        this.height = height;
    }

    public Uerss(String name) {
        this.name = name;
    }

    public Uerss(int age) {
        this.age = age;
    }

    public Uerss(int age, String name, double height, long phone) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.phone = phone;
    }

    public Uerss() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
class A{

}
interface X{

}
interface Y{

}
interface Z{

}