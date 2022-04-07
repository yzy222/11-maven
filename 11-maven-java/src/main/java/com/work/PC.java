package com.work;

public class PC {
    private CPU cpu;
    private HardDisk HD;

    public void show(){
        System.out.println("cpuSpeed:"+cpu.getSpeed()+"\tHDamount:"+HD.getAmount());
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHD(HardDisk HD) {
        this.HD = HD;
    }
}
