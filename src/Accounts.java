
public class Accounts {
	
	private String name;  //instant variable
	
	// constructor initializes name with parameter name
	public Accounts(String name)
	{

		this.name=name;

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
