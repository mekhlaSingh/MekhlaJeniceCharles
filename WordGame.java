

import java.util.Scanner;
public class WordGame {
public static void main(String [ ] args ) {
  
//create a scanner object
	
	Scanner scanner = new Scanner(System.in);
	//I think you should do this 

	
  //here i will declare the variables 
	String name; 
	int age;
	String city; 
	String college;
	String profession; 
	String animal; 
	String PetName;
	
	System.out.println("Enter your name:" );
	name = scanner.nextLine();
	 
	System.out.println("Enter your age:" );
	age = Integer.parseInt(scanner.nextLine());
	
	System.out.println("Enter the name of a city:" );
	city = scanner.nextLine();
	
	System.out.println("Enter the name of a college :" );
	college = scanner.nextLine();
	 
	System.out.println("Enter profession:" );
	profession = scanner.nextLine();
	  
	System.out.println("Enter a type of animal:" );
	animal = scanner.nextLine();
	
	System.out.println("Enter a pet name:" );
	PetName = scanner.nextLine();  
	
	//story is going right here 
	System.out.println("There once was a person named " + name + " who lived in " + city +". At the age of " + age + "," + 
					name+ " went to college at "+ college + ". " +  name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) dog named " + PetName  + ". They both " +
"lived happily ever after!");
	
	/* sample run 
	 * 
	 *There once was a person named Mekhla who lived in San Jose.
At the age of 18,Mekhla went to college at Foothill. Mekhla graduated and went to work as a Developer. Then, Mekhla adopted a(n) dog named Lucky. They both lived happily ever after!
	 *
	 */
	
   
   }
	
	
	
	
	
}
