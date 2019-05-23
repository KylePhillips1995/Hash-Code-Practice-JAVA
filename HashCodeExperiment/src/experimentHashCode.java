
public class experimentHashCode {

	
	public static void main(String[] args) {
		
		String[] hashCodeArray = {"Donald Trump", "Hillary Clinton", "Phil Murphy", "Kim Guadago", "Governor Christie", "Ronald Reagan", "Bill Clinton", "Barack Obama", "Jimmy Carter", "Lyndon Johnson", "Richard Nixon", "John Kennedy"};
		
		
		for(int i = 0; i <hashCodeArray.length; i++){
			
			String s1= hashCodeArray[i];
			int hashCode = s1.hashCode();
			if(hashCode < 0) {
				hashCode = hashCode * -1;
				
			}
			System.out.println(s1 + s1.hashCode() + "\nConverted Negative Hash: " + hashCode + "\t" + hashCode % 5 + "\t" + hashCode % 10 + "\t" + hashCode % 15);
			
			
		}
		
		
		
	}
}
