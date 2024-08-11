import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class morseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word for which no of unique transformation word is required");
		String words = sc.next();
		
		
		sc.close();
		
		 String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                 "....","..",".---","-.-",".-..","--","-.",
                 "---",".--.","--.-",".-.","...","-","..-",
                 "...-",".--","-..-","-.--","--.."};
		 
		 Set<String> morseSet = new HashSet<>();
		 
		 for(String word: words)
		 {
			 StringBuilder code = new StringBuilder();
			 for(char c:word.toCharArray())
			 {
				 code.append(morse[c - 'a']);
				 morseSet.add(code.toString());
			 }
		 }
		 return morseSet.size();

	}

}
