package mult;
class Eggy extends Thread{
	public void run() {
		
		for(int i = 0; i < 5 ; i++) {
			try {
			sleep(1000);
		}catch(InterruptedException e) {}
			System.out.println("ßéöî â " + (i+1) + " ðàç òåáå ãîâîðþ!");
		}
	}
}

public class disput {
	static Eggy mAnotherOpinion;
	public static void main(String[] args) {
		mAnotherOpinion = new Eggy();
		System.out.println("íà÷àòü ñïîð");
		mAnotherOpinion.start();
		for(int i = 0 ; i < 5 ; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println("ÊÓÐÈÖÀ!!!!");
		}
		if(mAnotherOpinion.isAlive()) {
			try {
				mAnotherOpinion.join();
			}catch(InterruptedException r ) {}
			System.out.println("ßÉÖÎ-ÒÀÊÈ");
		}else {
			System.out.println("ÊÓÐÈÖÀ-ÒÀÊÈ");
			
		}
		System.out.println("ñïîð îêîí÷åí!");
	}

}

