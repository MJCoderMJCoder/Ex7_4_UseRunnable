package com.userunnable;

class Master extends Student implements Runnable {
	
	Master(String Name) {
		super(Name);	//调用父类的构造方法
	}
	
	//子类的成员方法、成员变量与父类同名是，父类的成员方法、成员变量被覆盖。
	public void printInformation() {	//覆盖父类的方法，实现特定的功能
		System.out.println("我是一名研究生！我叫" + this.Name);
	}
	
	public void run() {	//实现Runnable接口类的run()方法里线程执行的代码
		printInformation();
	}
}
