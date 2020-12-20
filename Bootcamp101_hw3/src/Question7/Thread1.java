package Question7;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Question2.Book;


public class Thread1 extends Thread{

	public Thread1(){
		
	}
	
	@Override
	public void run() {

		System.out.println("1st Thread is started!");
		Stream<Integer> evenNumbersStream = oddAndEvenNumbers.list1.stream();
		Predicate<Integer> evenNumbers = (number) -> {
			return (number % 2) == 0;
		};
		
		List<Integer> evenNumbersList = evenNumbersStream.filter(evenNumbers).collect(Collectors.toList());
		oddAndEvenNumbers.evenNumbersList.addAll(evenNumbersList);
		
		Stream<Integer> oddNumbersStream = oddAndEvenNumbers.list1.stream();
		Predicate<Integer> oddNumbers = (number) -> {
			return (number % 2) != 0;
		};
		
		List<Integer> oddNumbersList = oddNumbersStream.filter(oddNumbers).collect(Collectors.toList());
		oddAndEvenNumbers.oddNumbersList.addAll(oddNumbersList) ;
		
	}
}