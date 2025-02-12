package thread;

public class Properties {
	
	public static void main(String[] args) {
		Thread T = new Thread();
		System.out.println(T.getName());
		System.out.println(T.getId());
		System.out.println(T.getPriority());
	    
		T.setName("Umesh Anna");
		System.out.println(T.getName());
		T.setPriority(7);
		System.out.println(T.getPriority());
		
		
	}
 

}
