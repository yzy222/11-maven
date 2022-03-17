package com.thread;

public class TreadText {
    public static void main(String[] args) {
        //void setPriority(int newPriority)  设置线程优先级
        //int getPriority()   返回此线程的优先级。1--5--10
        //static void yield()   让位线程 暂停当前线程执行其他线程  运行状态--->就绪状态
        //void join()   合并线程
        /*void join()
        合并线程
        class MyThread1 extends Thread {
            public void doSome(){
                MyThread2 t = new MyThread2();
                t.join(); // 当前线程进入阻塞，t线程执行，直到t线程结束。当前线程才可以继续。
            }
        }

        class MyThread2 extends Thread{

        }*/
        //System.out.println(Thread.currentThread().getName()+"优先级"+Thread.currentThread().getPriority());
        System.out.println("main begin");
        Thread t=new Thread(new MyTread3());
        t.setName("t");
        t.start();
        try {
            t.join();//不是栈的合并 而是形成等待关系
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
    }
}


class MyTread3 implements Runnable{
    /*线程安全问题
    * 共享数据
    * 多线程并发
    * 共享数据有修改行为
    *解决方案：线程同步（线程排队）
    *
    *
    * void setDaemon(boolean on)
        将此线程标记为 daemon线程或用户线程 (守护线程)
        * void schedule(TimerTask task, Date firstTime, long period)
从指定 的时间开始 ，对指定的任务执行重复的 固定延迟执行 。
    * */
    //synchronized (共享对象){
    //
    // }
    //synchronized 出现在实例方法上只锁定this
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
