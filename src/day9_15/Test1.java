package day9_15;

public class Test1 extends Thread {

	
	
	@Override
	public void run() {


		while(true){
			
		System.out.println(Thread.currentThread().getName()+"======="+Thread.currentThread().getPriority());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		
		
	}

	public static void main(String[] args) {

		
		Thread t1=new Test1();
		t1.setName("线程1");
		t1.setPriority(MAX_PRIORITY);
		
		
		
		Thread t2=new Test1();
		t2.setName("线程2");
		t2.setPriority(MIN_PRIORITY);

		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getPriority());

	}

}
