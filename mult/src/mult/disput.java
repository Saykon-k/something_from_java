package mult;
class Eggy extends Thread{
	public void run() {
		
		for(int i = 0; i < 5 ; i++) {
			try {
			sleep(1000);
		}catch(InterruptedException e) {}
			System.out.println("���� � " + (i+1) + " ��� ���� ������!");
		}
	}
}

public class disput {
	static Eggy mAnotherOpinion;
	public static void main(String[] args) {
		mAnotherOpinion = new Eggy();
		System.out.println("������ ����");
		mAnotherOpinion.start();
		for(int i = 0 ; i < 5 ; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println("������!!!!");
		}
		if(mAnotherOpinion.isAlive()) {
			try {
				mAnotherOpinion.join();
			}catch(InterruptedException r ) {}
			System.out.println("����-����");
		}else {
			System.out.println("������-����");
			
		}
		System.out.println("���� �������!");
	}

}

