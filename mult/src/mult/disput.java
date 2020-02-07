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
class Young_man extends Thread{
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
	static Young_man young_man;
	static Man old_man;
	public static void main(String[] args) throws InterruptedException {
		
		young_man = new Young_man();
		old_man = new Man();
		System.out.println("start  the disput");
		young_man.start();
		old_man.start();
		
		System.out.println("объект v1 "+ young_man.isAlive());
		System.out.println("объект v2 "+ old_man.isAlive());
		
		if(young_man.isAlive()) {
			try {
				young_man.join();
			}catch(InterruptedException r ) {}
			System.out.println("Коррупция побеждена");
		}else {
			System.out.println("Владимир путин молодец");
			
		}
		
		System.out.println("объект v1 "+ young_man.isAlive());
		System.out.println("объект v2 "+ old_man.isAlive());
		
		Thread.sleep(3000);
		
		System.out.println("объект v1 "+ young_man.isAlive());
		System.out.println("объект v2 "+ old_man.isAlive());
		
		System.out.println("спор окончен!");
	}

}