package com.sunhu.demo;

/**
 * Created by Administrator on 2018/8/8.
 */
public class ThreadDemo extends Thread{
    int i = 0;
    //重写run方法，run方法的方法体就是现场执行体
    @Override
    public void run()
    {
        for(;i<100;i++){
            System.out.println(getName()+"  "+i);
        }
    }
    public static void main(String[] args)
    {
        for(int i = 0;i< 100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"  : "+i);
            if(i==20)
            {
                new ThreadDemo().start();
                new ThreadDemo().start();
            }
        }
    }

}
