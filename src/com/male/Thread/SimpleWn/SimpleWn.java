package com.male.Thread.SimpleWn;

public class SimpleWn {

	final static Object obj = new Object();
	
	public static class T1 extends Thread{
		
		public void run(){
			synchronized(obj){
				System.out.println(System.currentTimeMillis() + ": T1 start");
				
				try {
					System.out.println(System.currentTimeMillis() + ": T1 wait for obj");
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis() + ": T1 end");
			}
		}
	}
	
	public static class T2 extends Thread{
		public void run(){
			synchronized(obj){
				System.out.println(System.currentTimeMillis() + ": T2 start notify one");
				obj.notify();
				System.out.println(System.currentTimeMillis() + ": T2 end");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new T1();
		Thread t2 = new T2();
		
		t1.start();
		t2.start();
	}
}
