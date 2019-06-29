package com.userunnable;
/*
 * 使用Runnable接口创建线程的步骤：
 * 1.创建实现Runnable接口的类MyRunnable，并在MyRunable类的run()方法里编写想让线程执行的代码;
 * 2.创建实现了Runnable接口类的实例：myRunnable;
 * 3.创建线程类Thread的实例，并用构造方法(Runnable target)将myRunnable赋值给target；
 * 4.得到线程类实例，调用start()方法后启动线程。
 */
public class UseRunnable {

	public static void main(String[] args) {
		Master master = new Master("如来");
		Thread thread = new Thread(master);
		thread.start();

	}

}
