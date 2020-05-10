package ListConcept;

import java.util.ArrayList;

public class ArrayListConcepts {
	
	static{
		
		System.out.println("Static" );
		  
	} 

	public static void main(String[] args) {

		
		ArrayList<String> ar1 = new ArrayList<String>(); // Generic in java 
		
		ar1.add("Tushar"); 
		ar1.add("Hello"); 
		ar1.add("Testing "); 
		//ar1.add(123);  This will not allow as the Arraylist is String type 
		
		
		ar1.add(1, "Naveen sir");
		System.out.println(ar1.size());
		ar1.remove(2);
		
	
		System.out.println(ar1.size());
		
		

	}

}
