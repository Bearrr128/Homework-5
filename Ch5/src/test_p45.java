
class test_p45 {
	public static void main(String[] args) {
		Car_p45 car1=new Car_p45("1����");
		car1.start();
		
		Car_p45 car2=new Car_p45("2����");
		car2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}
class Car_p45 extends Thread{
	private String name;
	
	public Car_p45(String nm) {
		name=nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}