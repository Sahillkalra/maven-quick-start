package kalra.sahill.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
	String[] seperateWords = StringUtils.split(words, ' ');
	return (seperateWords == null)? 0 : seperateWords.length;
	}
	
	public void greet(){
		List<String> lists = new ArrayList<>();
		
		lists.add("hello");
		
		for (String list : lists){
			System.out.println(list);
		}
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	int count = app.countWords(" I have four words");
	System.out.println("Word Count: "+ count);
    }
}