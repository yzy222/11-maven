package com.work;
/*（2）编写测试类BoxTest，使用类中定义的各个方法，并将其结果输出。*/
public class BoxTest {
    public static void main(String[] args) {
        Box box=new Box();
        box.setInfo(2,3,4);
        System.out.println("area"+box.area());
        System.out.println("volumn"+box.volumn());
        System.out.println(box.toString());
    }

}
