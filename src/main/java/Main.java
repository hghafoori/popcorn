public class Main {
	private static long NO_OF_MICROSECS_IN_A_DAY=24*60*60*1000L;
	private static long NO_OF_NANOSECS_IN_A_DAY=24*60*60*1000*1000L;
	public static void main(String args[]) {
		
		System.out.println(NO_OF_NANOSECS_IN_A_DAY);
		System.out.println(NO_OF_MICROSECS_IN_A_DAY);
		System.out.println(NO_OF_NANOSECS_IN_A_DAY/NO_OF_MICROSECS_IN_A_DAY);
		
	}
}