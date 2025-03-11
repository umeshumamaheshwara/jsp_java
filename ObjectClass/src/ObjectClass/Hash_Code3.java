package ObjectClass;

//Modifying the HashCode



public class Hash_Code3 {
	public static void main(String[] args) {
		sample s1 =new sample();
		System.out.println(s1.hashcode());
		
	}

}
class sample
{
	public int hashcode()
	{
		return 123;
	}
}