package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sortingg {

	public static void main(String[] args) {


				List<String> list = new ArrayList<String>();

				list.add("chetah");
				list.add("lion");
				list.add("monkey");
				list.add("frog");
				list.add("giraffe");

				Collections.sort(list);
		             
				Iterator iter = list.iterator();
				System.out.println("using while loop");
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}
				System.out.println("using for loop");
				for(String animals:list) {
					System.out.println(animals);
				}
				List<Integer> listnumber = new ArrayList<Integer>();
				listnumber.add(31);
				listnumber.add(50);
				listnumber.add(55);
				listnumber.add(29);
				
				Collections.sort(listnumber);
				
				for(Integer numberlist:listnumber) {
					
					System.out.println(" using enchanced loop  " +numberlist);
				}
				

			}

		

}
