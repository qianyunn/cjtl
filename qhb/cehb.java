package qhb;

public class cehb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hb p1=new hb("��");
		hb p2=new hb("��");
		hb p3=new hb("��");
		hb p4=new hb("��");
		hb p5=new hb("��");
		Thread pp1=new Thread(p1);
		Thread pp2=new Thread(p2);
		Thread pp3=new Thread(p3);
		Thread pp4=new Thread(p4);
		Thread pp5=new Thread(p5);
		pp1.start();
		pp2.start();
		pp3.start();
		pp4.start();
		pp5.start();
		

	}

}
