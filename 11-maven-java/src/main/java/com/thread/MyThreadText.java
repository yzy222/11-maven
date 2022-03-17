package com.thread;

public class MyThreadText {
    public static void main(String[] args) {
        /*MyThread myThread=new MyThread();
        myThread.start();//启动线程
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程+"+i);
        }*/
        //Thread(实现Runnable类)
        /*Thread thread=new Thread(new MyThread2());
        thread.setName("aaa");//Thread-0
        System.out.println(thread.getName());
        thread.start();*/
        //static Thread currentThread()   获取当前线程
        System.out.println(Thread.currentThread().getName());
       /* for (int i = 0; i < 10000; i++) {
            System.out.println("主线程+"+i);
        }*/
        //匿名内部类
        /*Thread e=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });*/
        //static void sleep(long millis)  让当前线程进入休眠，进入阻塞状态，放弃占有的时间片，让给其他线程
        //static void sleep(long millis, int nanos) （毫秒数加纳秒数）
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//5秒
        System.out.println("helloworld");
        //间隔特定时间执行一段特定代码
        /*for (int i = 0; i < 10; i++) {
            System.out.println("--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        MyThread ttt=new MyThread();
        Thread t=new Thread(ttt);
        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //t.interrupt();//干扰  终断机制依靠Java异常处理机制
        //t.stop();已过时 不正常关闭易导致数据损失
        ttt.run=false;//需要终止是修改run值
    }
}
class MyThread extends Thread{
    //继承Tread 重写run方法 （只能try无法上抛   子类不能抛出比父类更多的异常）(实现类同理)
    boolean run=true;//布尔标记
    public void run(){
        /*System.out.println(Thread.currentThread().getName()+"--->begin");
        try {
            Thread.sleep(1000*60*60*24);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->end");*/
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else return;
        }
    }
}

class MyThread2 implements Runnable{
    //实现Runnable 实现run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}