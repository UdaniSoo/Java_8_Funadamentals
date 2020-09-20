import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// Create a scanner object to obtain input from the command window
//		Scanner input =new Scanner(System.in);
//		
//		//Creating and Account object and assign it to myAccount
//		Accounts myAccount =new Accounts();
//		
//		// display initial value of name(null)
//		System.out.printf("initial name is: %s%n%n", myAccount.getName());
//		
//		// prompt for and read name
//		System.out.println("Please enter the name");
//		String theName= input.nextLine();  //this take the input after user enter the value and press enter
//		myAccount.setName(theName); //put theName in myAccount
//		System.out.println(); //outputs a blank line
//		
//		//display the name stored in object account
//		System.out.printf("Name in the object my account is:%n",myAccount.getName());
		
		
		
		// display the name stored in object
		
		//Constructors
		Accounts account1=new Accounts("Test acc1");
		Accounts account2=new Accounts("Test acc2");
		
		System.out.printf("Acc1 name: %s%n", account1.getName());
		System.out.printf("Acc2 name: %s%n", account2.getName());


	}

}
