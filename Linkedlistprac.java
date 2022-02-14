package collections;

import java.util.LinkedList;

public class Linkedlistprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("richa");
		ll.add("anjali");
		ll.add("anand");
		ll.add("sujatha");
		for(String names: ll) {
			System.out.println("the name in team :"+names);
		}
		ll.addFirst("Ram");
		ll.addLast("karthika");
		System.out.println("after adding");
		for(String name: ll) {
			System.out.println("the name in team :"+name);
		}

	}

}
