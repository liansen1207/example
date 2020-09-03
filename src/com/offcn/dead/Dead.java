package com.offcn.dead;

public class Dead implements Runnable{

    Object obj = new Object();

    private boolean flag;

    public Dead(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            while(true) {

                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + "if.....this");
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "if.....obj");
                    }
                }
            }
        }else{
            while(true) {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + "else.....obj");
                    synchronized (this) {
                        System.out.println(Thread.currentThread().getName() + "else.....this");
                    }
                }
            }
        }
    }
}
