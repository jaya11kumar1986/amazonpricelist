package interviewQuestions;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String input="i am srividhya";
		
		String []word=input.split(" ");
		
		String output="";
		
		for(int i=word.length-1;i>=0;i--) {
			
			output=output+word[i]+" ";
		}
		
		System.out.println(output);

	}

}
