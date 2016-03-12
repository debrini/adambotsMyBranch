package com.github.adambots.stronghold2016.camera;

public class TargetingMain extends Thread{
	public static void init(){
		(new Thread( new TargetingMain())).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Camera.init();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Camera.openStream();
//		while(true){
			Target target = Camera.getTarget();
			if(target != null){
				target.publishTarget();
			}
//		}
		Camera.closeStream();
	}
	@Override
	public void interrupt() {
		// TODO Auto-generated method stub
		super.interrupt();
		Camera.closeStream();
	}
	
	
	
}
