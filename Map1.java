package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<Integer,String>();
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
