import java.util.StringTokenizer;

public class Snippet {
	public static void main(String[] args) {
	    final StringTokenizer tokenizer = new StringTokenizer("my name is   john", " ");
	
	
	    System.out.println("my name is   john ".split(" ").length);
	    System.out.println(tokenizer.countTokens());
	    
	    if (tokenizer.countTokens() == 1) {
	        return;
	    }
	} 
}