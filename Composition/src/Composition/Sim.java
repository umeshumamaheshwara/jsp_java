package Composition;

class SIMCARD
{
	void Jio()
	{
		System.out.println("Jio Sim..");
	}
	void Aritel()
	{
		System.out.println("Airtel Sim..");
	}
	void BSNL()
	{
		System.out.println("Bsnl.. ");
	}
}

class Mobile
{
	private SIMCARD simcard;
	
	public Mobile()
	{
		simcard = new SIMCARD();
	}
	void Call()
	{
		simcard.Jio();
		simcard.BSNL();
		simcard.Aritel();
	}
	
}



public class Sim 
 {
	public static void main(String[] args) 
	{
		Mobile mob = new Mobile();
		mob.Call();
	}

}
