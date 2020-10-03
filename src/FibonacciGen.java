/**
 * Generates a fibonacci number up to a max value
 * 
*/
public class FibonacciGen {
	private static final int MAX_TERM_VALUE = 10000;
	
	public static void main(String[] args) {
		System.out.println("This program lists the Fibonacci sequence");
		int fib0 = 0;
		int fib1 = 1;
		int fibNext = fib0 + fib1;
		
		System.out.println(fib0);
		System.out.println(fib1);
		
		while (fibNext < MAX_TERM_VALUE) {
			System.out.println(fibNext);
			
			fib0 = fib1;
			fib1 = fibNext;
			fibNext = fib0 + fib1;
		}
		
		
	}

}
