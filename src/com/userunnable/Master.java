package com.userunnable;

class Master extends Student implements Runnable {
	
	Master(String Name) {
		super(Name);	//���ø���Ĺ��췽��
	}
	
	//����ĳ�Ա��������Ա�����븸��ͬ���ǣ�����ĳ�Ա��������Ա���������ǡ�
	public void printInformation() {	//���Ǹ���ķ�����ʵ���ض��Ĺ���
		System.out.println("����һ���о������ҽ�" + this.Name);
	}
	
	public void run() {	//ʵ��Runnable�ӿ����run()�������߳�ִ�еĴ���
		printInformation();
	}
}
