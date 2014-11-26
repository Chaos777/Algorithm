package second;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;



public class Compare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strings={"A","b","c","d","eee","lmn","tdf","ut","tengc","wasd"};
		int [] inttemp={10,5,4,12,89,69,98,98,100,100,5,4};
		List<String > ssList= new LinkedList<String>();
		List<Integer> sList = new LinkedList<Integer>();
		for(String s:strings)
			ssList.add(s);
		System.out.println(Min(ssList));
		Collections.sort(ssList);
		System.out.println("ÉýÐò");
		for(String d:ssList)
			System.out.print(d+"\t");
		System.out.println();
		for(int t:inttemp)
			sList.add(t);
		System.out.println(Min(sList));
		Collections.sort(sList,Collections.reverseOrder());
		System.out.println("½µÐò");
		for(int t:sList)
			System.out.print(t+"\t");
		System.out.println();
		List<String> testIntegers= new ArrayList<String>(10);
		Collections.fill(testIntegers, "lcz");
		for(String in:testIntegers){
			System.out.print(in+"\t");			
		}
		
	}
	
	
	public static <T extends Comparable> T Max(Collection<T>c){
		if(c.isEmpty()) throw new NoSuchElementException();
		Iterator<T> iter = c.iterator();
		T larges = iter.next();
		while(iter.hasNext()){
			T next = iter.next();
			if(larges.compareTo(next)<0)
				larges = next;
		}
		return larges;
	}
	
	public static <T extends Comparable> T Min(Collection<T>c){
		if(c.isEmpty()) throw new NoSuchElementException();
		Iterator<T> iter = c.iterator();
		T larges = iter.next();
		while(iter.hasNext()){
			T next = iter.next();
			if(larges.compareTo(next)>0)
				larges = next;
		}
		return larges;
	}

}
