
class test_p52 {
	public static void main(String[] args) {
		Company cmp=new Company();
		
		Driver dr1=new Driver(cmp);
		dr1.start();
		
		Driver dr2=new Driver(cmp);
		dr2.start();
	}
}

class Company{
	private int sum=0;
	
	public void add(int a) {
		int tmp=sum;
		System.out.println("�ثe���X�p���B�O"+tmp+"��");
		System.out.println("�Ȩ�"+a+"���F");
		tmp=tmp+a;
		System.out.println("�X�p���B�O"+tmp+"��");
		sum=tmp;
	}
}

class Driver extends Thread{
	private Company comp;
	public Driver(Company c) {
		comp=c;
	}
	
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}