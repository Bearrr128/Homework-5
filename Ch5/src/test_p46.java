class test_p46 {
	public static void main (String[] args) {
		Car_p46 car1=new Car_p46("1號車");
		car1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("正在進行mane()的處理工作");
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
				System.out.println("正在進行"+name+"的處理工作");
			}
			catch(InterruptedException e){
				
			}
		}
	}
}