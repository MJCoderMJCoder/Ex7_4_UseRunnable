package com.userunnable;
/*
 * ʹ��Runnable�ӿڴ����̵߳Ĳ��裺
 * 1.����ʵ��Runnable�ӿڵ���MyRunnable������MyRunable���run()�������д�����߳�ִ�еĴ���;
 * 2.����ʵ����Runnable�ӿ����ʵ����myRunnable;
 * 3.�����߳���Thread��ʵ�������ù��췽��(Runnable target)��myRunnable��ֵ��target��
 * 4.�õ��߳���ʵ��������start()�����������̡߳�
 */
public class UseRunnable {

	public static void main(String[] args) {
		Master master = new Master("����");
		Thread thread = new Thread(master);
		thread.start();

	}

}
