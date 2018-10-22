package kalra.sahill.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
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
    }
}