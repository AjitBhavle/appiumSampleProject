package appiumSampleProject;

import java.util.ArrayList;
import java.util.List;

public class Test {

	   public static void main(String[] args) {  
	        List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        System.out.println("------------Iterating by passing method reference---------------");  
	        gamesList.forEach(System.out::println);  
	    }
	
}
