package qhb;

import java.util.ArrayList;

public class hb implements Runnable{
	static int i=200;
	String name;
	static ArrayList<String> all=new ArrayList();
	public hb(String name){
		this.name=name;
		
	}
	
	
	public void run(){
		
			
			while(i>0){
				if(all.indexOf(name)!=-1){
					
				}
				else{
				all.add(name); 
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				synchronized (this) {
				if(all.size()<5){
					int mm= (int) ((Math.random()*i/2-1)+1);
					i=i-mm;
					System.out.println(name+"抢到"+(mm)+"还剩下"+i);
					
					
				}
				else if(all.size()==5){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(name+"抢到"+i);
					i=0;
					
					
				}
				
				}
				
		}
			if(all.size()==5){
				break;
			}
		}
		
	
	
	}

}
