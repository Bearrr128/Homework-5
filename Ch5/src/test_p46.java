class test_p46 {
	public static void main (String[] args) {
		Car_p46 car1=new Car_p46("1����");
		car1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��mane()���B�z�u�@");
		}
		
	}
}

class Car_p46 extends Thread{
	private String name;
	
	public Car_p46(String nm) {
		name=nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(1000);
				System.out.println("���b�i��"+name+"���B�z�u�@");
			}
			catch(InterruptedException e){
				
			}
		}
	}
}