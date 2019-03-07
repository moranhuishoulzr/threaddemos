package chapter02.section03.thread_2_3_2.project_1_t10;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();

		System.out.println("ÎÒÒªÍ£Ö¹Ëü£¡stopThread="
				+ Thread.currentThread().getName());
		/*try {
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}*/
		printStringService.setContinuePrint(false);
	}

}
