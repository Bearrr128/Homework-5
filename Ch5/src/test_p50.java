
class test_p50 {
	public static void main (String[] args) {
		Car_p50 car1=new Car_p50("1號車");
		
		Thread th1=new Thread(car1);
		th1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("正在進行mane()的處理工作");
		}
	}
}

class Car_p50 implements Runnable{
	private String name;
	
	public Car_p50(String nm) {
		name=nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");	
		}
	}
}
