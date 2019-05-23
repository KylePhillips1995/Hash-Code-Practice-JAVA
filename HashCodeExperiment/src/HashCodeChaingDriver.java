import java.util.*;

public class HashCodeChaingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] list2 = {"Donald Trump", "Gerald Ford", "Harray Truman", "Ronald Reagan", " Barack Obama", "John Kennedy", "Lyndon Johnson", "Richard Nixon", "Dwight Eisenhower", "Franklin Roosevelt", "Theodore Roosevelt", "Bill Clinton", "George Busch", "Herbert Hoover", "Woodrwo Wilson", "Warren Harding", "William Taft"};
	
		
			
			for(int i = 0; i < list2.length; i++) {
		
				int hashcode = 0;
				hashcode = list2[i].hashCode();
				
				if(hashcode < 0) {
					
					hashcode = -1*hashcode;
				}
				hashcode = hashcode % 10;
				System.out.println(list2[i] + " Actual Hashcode: " + list2[i] + "Hashcode: " + hashcode);
		
	
	}

	List<LinkedList<String>> list3 = new LinkedList<LinkedList<String>>();
	
	for(int i = 0; i < 10; i++) {
		
		list3.add(new LinkedList<String>());
	}
	
	for (int i = 0; i < list2.length; i++) {
		int hashcode = 0;
	hashcode = list2[i].hashCode();
	if(hashcode < 0) {
		hashcode = -1 * hashcode;
	}
	
	hashcode = hashcode % 10;
	list3.get(hashcode).add(list2[i]);
	
	}
	
	for(int i = 0; i < list3.size(); i ++ ) {
		
		if(list3.get(i).size() == 0)
		{
			System.out.println(i + " -> ");
		}
		
		for(int j = 0; j < list3.get(i).size(); j++) {
			System.out.print(list3.get(i).get(j) + " " + i + " ->");
			
		}
			System.out.println();
			
		}
		
	
String S1 = "James Bond";

boolean success = false;

for (int i = 0; i < list3.size(); i++) {
	for (int j = 0; j < list3.get(i).size(); j++) {
		
		String find = list3.get(i).get(j);
		if(find.equals(S1))
		{
			success = true;
			System.out.println("Object found: " + find + "Temp HashCode " + i);
			break;
		}
		if (success) {
			System.out.println("Object Not Found Yet");
			break;
			
			}
		if(!success) {
			
			System.out.println("Object never found");
		
		
		}
		
		
	}
}
	
	
	}
	
	
	
	}
		
		



