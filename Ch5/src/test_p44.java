class test_p44 {
	public static void main(String[] args) {
		Car_p44 car1=new Car_p44("1����");
		car1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car_p44 extends Thread{
	private String name;
	
	public Car_p44(String nm) {
		name=nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}


