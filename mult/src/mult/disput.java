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
		
		System.out.println("������ v1 "+ mAnotherOpinion.isAlive());
		System.out.println("������ v2 "+ mAnotherOpinion_v2.isAlive());
		
		if(mAnotherOpinion.isAlive()) {
			try {
				mAnotherOpinion.join();
			}catch(InterruptedException r ) {}
			System.out.println("����-����");
		}else {
			System.out.println("������-����");
			
		}
		
		System.out.println("������ v1 "+ mAnotherOpinion.isAlive());
		System.out.println("������ v2 "+ mAnotherOpinion_v2.isAlive());
		
		Thread.sleep(3000);
		
		System.out.println("������ v1 "+ mAnotherOpinion.isAlive());
		System.out.println("������ v2 "+ mAnotherOpinion_v2.isAlive());
		
		System.out.println("���� �������!");
	}

}

