package interviewQuestions;

public class StringReverse {

	public static void main(String[] args) {
		
		String input="srividhya";
		
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--) {
			
			rev=rev+input.charAt(i);
		}
		
		System.out.println(rev);

	}

}
