
class test_p48 {
	public static void main (String[] args) {
		Car_p48 car1=new Car_p48("1����");
		car1.start();
		
		try {
			car1.join();
		}
		catch(InterruptedException e){
		}
		
		System.out.println("����main()���B�z�u�@");
	}
}

class Car_p48 extends Thread{
	private String name;
	
	public Car_p48(String nm) {
		name=nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");	
		}
	}
}