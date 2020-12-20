package Question7;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws InterruptedException {

		oddAndEvenNumbers q7 = new oddAndEvenNumbers();
		
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		thread2.start();
		
		Thread3 thread3 = new Thread3();
		thread3.start();
		
		Thread4 thread4 = new Thread4();
		thread4.start();

		System.out.println("**Before sleeping**");
		System.out.println(oddAndEvenNumbers.evenNumbersList);
		System.out.println(oddAndEvenNumbers.oddNumbersList);
		Thread.sleep(3000);
		System.out.println("**After sleeping for 2 seconds**");
		System.out.println("List 1: " + oddAndEvenNumbers.list1);
		System.out.println("List 2: " + oddAndEvenNumbers.list2);
		System.out.println("List 3: " + oddAndEvenNumbers.list3);
		System.out.println("List 4: " + oddAndEvenNumbers.list4);
		System.out.println("Even Numbers: " + oddAndEvenNumbers.evenNumbersList);
		System.out.println("Odd Numbers: " + oddAndEvenNumbers.oddNumbersList);
		
	}

}
