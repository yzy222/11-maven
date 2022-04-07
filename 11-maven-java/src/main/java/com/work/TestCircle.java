package com.work;

/*（2）编写测试类TestCircle，使用Circle类创建两个对象，通过相应方法分别设置不同的半径值，计算各自的面积及周长并显示结果。*/
public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        c1.setR(3);
        c2.setR(4);
        System.out.println("c1:"+c1.getArea()+"/"+c1.getPerimeter());
        System.out.println("c2:"+c2.getArea()+"/"+c2.getPerimeter());
    }
}
