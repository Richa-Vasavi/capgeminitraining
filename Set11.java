package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new TreeSet<String>();
		s.add("Hello");
		s.add("Hi");
		s.add("Hey");
		s.add("Good Morning");
		s.add("Hey");
		s.add("Hey");
		s.add("Hey");
		s.add("Hi");
		//s.add(null);
		Iterator i = s.iterator();
		if (i != null) {
			while (i.hasNext()) {
				System.out.println("types :" + i.next());
			}

		}
	}
}
