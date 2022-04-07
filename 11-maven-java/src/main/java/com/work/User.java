package com.work;
/*（2）在主类User的main（）方法中用Vehicle类创建对象，并让该对象调用方法设置速度和功率，演示加速和减速功能，并输出当前的速度与功率。*/
public class User {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setPower(2000);
        v.setSpeed(120);
        v.speedUp(20);
        v.speedDown(40);
        System.out.println("s"+v.getSpeed()+"\tp:"+v.getPower());
    }
}
