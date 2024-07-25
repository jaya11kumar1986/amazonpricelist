package amazonprice;

public class ReverseEachSentence {

	public static void main(String[] args) {
		
	String input="i am srividhya";
		
		String []word=input.split(" ");
		
		String output="";
		
		for(String words :word) {
			
			String rev="";
			
			for(int i=words.length()-1;i>=0;i--) {
				
				rev=rev+words.charAt(i);
			}
			
			output=output+rev+" ";
		}
		
		System.out.println(output);

	}

}
