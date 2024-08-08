// Do not change the implementation

package Test_Scenario_PUT;

import java.util.ArrayList;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import Sources.*;
import Test_Scenario_PUT.*;


public class RunAsJunitCore {
	public static void main(String[] args) {
	    try{
	        System.out.println(" Result for 'Put_Request' ....");
    		Result result1 = JUnitCore.runClasses(Test_Scenario_PUT.Put_Request.class);
    		System.out.println("Test Case Count : " +result1.getRunCount());
    		System.out.println("Failure Count : " +result1.getFailureCount());
    		
    		Test_Scenario_PUT.Put_Request.detailsInList =  new ArrayList<Train>();
    		
    		    		
    		for (Failure failure : result1.getFailures())
            {
                System.out.println(failure.toString());
            }
		
		
		
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}
}