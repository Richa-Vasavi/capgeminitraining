package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		Iterator i =list.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());	
		}
	

	}

}
