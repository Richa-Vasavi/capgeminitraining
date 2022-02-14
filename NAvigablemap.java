package collections;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

public class NAvigablemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> m = new TreeMap<Integer,String>();
		m.put(1,"neem");
		m.put(2, "eucalyptus");
		m.put(3, "tulasi");
		m.put(4,"lavender" );
		Set set = m.entrySet();
		Iterator i= set.iterator();
		while (i.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) i.next();
			System.out.println(" Key--->" + entry.getKey() + "value -->"+entry.getValue());
		}

	}

}
