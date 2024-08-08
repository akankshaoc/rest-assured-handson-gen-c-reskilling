package Test_Scenario_GET;

import java.util.ArrayList;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import Sources.*;
import Test_Scenario_GET.*;


public class RunAsJunitCore {
	public static void main(String[] args) {
	    try{
	        System.out.println(" Result for 'Get_Request' ....");
    		Result result1 = JUnitCore.runClasses(Test_Scenario_GET.Get_Request.class);
    		System.out.println("Test Case Count : " +result1.getRunCount());
    		System.out.println("Failure Count : " +result1.getFailureCount());
    		
    		Test_Scenario_GET.Get_Request.customerList =  new ArrayList<VegStore>();
    		
    		    		
    		for (Failure failure : result1.getFailures())
            {
                System.out.println(failure.toString());
            }
		
		
		
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}
}