
public class test_p55 {
	public static void main(String[] args) {
		Company_p55 cmp=new Company_p55();
		Driver_p55 dr1=new Driver_p55(cmp);
		dr1.start();
		
		Driver_p55 dr2=new Driver_p55(cmp);
		dr2.start();
	}
}

class Company_p55{
	private int sum=0;
	
	public synchronized void add(int a) {
		int tmp=sum;
		System.out.println("�ثe���X�p���B�O"+tmp+"��");
		System.out.println("�Ȩ�"+a+"���F");
		tmp=tmp+a;
		System.out.println("�X�p���B�O"+tmp+"��");
		sum=tmp;
	}
}
class Driver_p55 extends Thread{
	private Company_p55 comp;
	public Driver_p55(Company_p55 c) {
		comp=c;
	}
	
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}