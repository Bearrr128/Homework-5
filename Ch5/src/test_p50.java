
class test_p50 {
	public static void main (String[] args) {
		Car_p50 car1=new Car_p50("1����");
		
		Thread th1=new Thread(car1);
		th1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��mane()���B�z�u�@");
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
			System.out.println("���b�i��"+name+"���B�z�u�@");	
		}
	}
}
