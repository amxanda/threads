public class JobDois implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < Main.MAX; i++) {
			System.out.printf("Thread %s iter %d\n", Thread.currentThread().getName(), i);
		}
	}
}