
public class Accounts {
	
	private String name;  //instant variable
	private double balance; //instance variable
	
	
	// constructor initializes name with parameter name
	public Accounts(String name, double balance)
	{

		this.name=name; // Assign name to instance variable name
		
		//
		
		if (balance > 0.0) {
			this.balance=balance; //Assign to the instance variable
			
		}

	}
	//method to set the name in the object
	
	
	public void setName(String name) {
		
		this.name=name;  //store the name
	
		
	}
	
	//method to retrieve the name from the object
	
	public String getName()
	{
		return this.name;        //return value of name to caller
	}



}
