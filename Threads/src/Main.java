public class Main {
	public static final int MAX = 999;
	
	public static void main(String[] args) {

		Job job1 = new Job();
		job1.setName("Job1");

		job1.start();

		Thread job2 = new Thread(new JobDois());
		job2.setName("Job2");  
		job2.start();

		for (int i = 0; i < MAX; i++) {
			System.err.printf("Thread %s iter %d\n", Thread.currentThread().getName(), i);
		}
	}
}