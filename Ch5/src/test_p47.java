
class test_p47 {
	public static void main (String[] args) {
		Car_p47 car1=new Car_p47("1����");
		car1.start();
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���b�i��mane()���B�z�u�@");
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}

class Car_p47 extends Thread{
	private String name;
	
	public Car_p47(String nm) {
		name=nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");	
		}
	}
}
