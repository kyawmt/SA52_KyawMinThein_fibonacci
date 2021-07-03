package sg.edu.iss.fibonacci.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FibService {
	
	public static List<Integer> getFibonacci(int element){
		
		List<Integer> fibs = new ArrayList<Integer>();
		
		if(element==1) {
			fibs.add(0);
		}else if(element==2) {
			fibs.add(0);
			fibs.add(1);
		}else if(element > 2 && element<=100 ) {
			fibs.add(0);
			fibs.add(1);
			for(int i=2; i<element; i++) {			
				fibs.add(fibs.get(i-1)+fibs.get(i-2));
			}
		}
		return fibs;
	}
	
	public static List<Integer> getSorted(List<Integer> fibs){
		
		List<Integer> sortedFibs = new ArrayList<Integer>();
		List<Integer> sortedFibsEven = new ArrayList<Integer>();
		List<Integer> sortedFibsOdd = new ArrayList<Integer>();
		
		if(fibs.size()!=0 || fibs!=null) {
			for(int i=fibs.size()-1; i>=0;i--) {			
				if(fibs.get(i)%2==0) {
					sortedFibsEven.add(fibs.get(i));
				}else {
					sortedFibsOdd.add(fibs.get(i));
				}
			}
			sortedFibs.addAll(sortedFibsEven);
			sortedFibs.addAll(sortedFibsOdd);
		}
		
		return sortedFibs;
		
	}

}
