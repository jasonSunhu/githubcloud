package com.sunhu.demo;

/**
 * Created by Administrator on 2018/8/8.
 */
public class ThreadDemo2 implements Runnable{
        private int i;
        @Override
        public void run()
        {
            for(i = 0;i <100;i++)
            {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        public static void main(String[] args)
        {
            for(int i = 0;i < 100;i++)
            {
                System.out.println(Thread.currentThread().getName()+" "+i);
                if(i==20)
                {
                    ThreadDemo2 rtt = new ThreadDemo2();
                    new Thread(rtt,"新线程1").start();
                    new Thread(rtt,"新线程2").start();
                }
            }
        }
    }
