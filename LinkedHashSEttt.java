package collections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSEttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("12");
		lhs.add("48");
		lhs.add("55");
		lhs.add("35");
		lhs.add("35");
		lhs.add("22");
		lhs.add(null);
		lhs.add(null);
		Iterator i = lhs.iterator();
		if(i != null) {
			while(i.hasNext()) {
				System.out.println(i.next());
			}

	}

}
}