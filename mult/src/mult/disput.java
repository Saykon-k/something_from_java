package mult;
class Man extends Thread{
	public void run() {
		for(int i = 0; i < 5 ; i++) {
			try {
			sleep(1000);
		}catch(InterruptedException e) {}
			System.out.println("mr Putin!");
		}
	}
}
class Eggy extends Thread{
	public void run() {
		
		for(int i = 0; i < 5 ; i++) {
			try {
			sleep(1000);
		}catch(InterruptedException e) {}
			System.out.println("mr Navalny!");
		}
	}
}

public class disput {
	static Eggy mAnotherOpinion;
	static Man mAnotherOpinion_v2;
	public static void main(String[] args) throws InterruptedException {
		
		mAnotherOpinion = new Eggy();
		mAnotherOpinion_v2 = new Man();
		System.out.println("start  the disput");
		mAnotherOpinion.start();
		mAnotherOpinion_v2.start();
		
		System.out.println("îáúåêò v1 "+ mAnotherOpinion.isAlive());
		System.out.println("îáúåêò v2 "+ mAnotherOpinion_v2.isAlive());
		
		if(mAnotherOpinion.isAlive()) {
			try {
				mAnotherOpinion.join();
			}catch(InterruptedException r ) {}
			System.out.println("ßÉÖÎ-ÒÀÊÈ");
		}else {
			System.out.println("ÊÓÐÈÖÀ-ÒÀÊÈ");
			
		}
		
		System.out.println("îáúåêò v1 "+ mAnotherOpinion.isAlive());
		System.out.println("îáúåêò v2 "+ mAnotherOpinion_v2.isAlive());
		
		Thread.sleep(3000);
		
		System.out.println("îáúåêò v1 "+ mAnotherOpinion.isAlive());
		System.out.println("îáúåêò v2 "+ mAnotherOpinion_v2.isAlive());
		
		System.out.println("ñïîð îêîí÷åí!");
	}

}

