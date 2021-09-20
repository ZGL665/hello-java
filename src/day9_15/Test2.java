package day9_15;

public class Test2 implements Runnable {

	 int count=100;
	
	@Override
	public void run() {
		
		 //int count=100;

		while (count>0) {

			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("当前是==" + Thread.currentThread().getName()+"==="+count--);
			
			
		}

	}

	public static void main(String[] args) {

		System.out.println("主线程" + Thread.currentThread().getName());

		Test2 target = new Test2();

		Thread t1 = new Thread(target);
		t1.setName("窗口1");
		t1.start();

		Thread t2 = new Thread(target);
		t2.setName("窗口2");
		t2.start();

		Thread t3 = new Thread(target);
		t3.setName("窗口3");
		t3.start();
		
		Thread t4 = new Thread(target);
		t4.setName("窗口4");
		t4.start();
		

	}

}
