package Map;

import java.util.HashMap;

public class Map_Sample {
	public static void main(String[] args) {
		HashMap<String, Long> h = new HashMap<String, Long>();
		HashMap<String, Long> h1 = new HashMap<String, Long>();
		h.put("Kamesh", 9482110936l);
		h.put("Ramesh", 9448817633l);
		h.put("Suresh", 9480703448l);
		h.put("Mahesh", 9353039062l);
		h.put(null, null);
		System.out.println(h.size());
		System.out.println(h.containsKey("Mahesh"));
		System.out.println(h.containsValue(9482110936l));
		System.out.println(h.isEmpty());
		System.out.println(h.get("Suresh"));
	
		
		
		
		h1.put("Umesh", 9482110936l);
		h1.put("Ramesh", 9448817633l);
		h.putAll(h1);
		System.out.println(h);
		h.replace("Kamesh", 9353039062l);
		System.out.println(h);
		
		//h.clear();
		System.out.println(h);
		System.out.println( h.entrySet());
	   	
		
	}

}
