package Module;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.ArrayList;
import Sources.*;

public class RunAsJunitCore {

	public static void main(String[] args) {
	    try{
	        System.out.println(" Result for 'MovieAPI' ....");
    		Result result1 = JUnitCore.runClasses(Module.MovieAPI.class);
    		System.out.println("Test Case Count : " +result1.getRunCount());
    		System.out.println("Failure Count : " +result1.getFailureCount());
    		
    		MovieAPI.detailsInList =  new ArrayList<Movie>();
    		
    		    		
    		for (Failure failure : result1.getFailures())
            {
                System.out.println(failure.toString());
            }
		
		
		
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}
}

