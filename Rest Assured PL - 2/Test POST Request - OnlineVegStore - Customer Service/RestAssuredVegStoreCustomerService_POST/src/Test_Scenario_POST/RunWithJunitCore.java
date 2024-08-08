package Test_Scenario_POST;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunWithJunitCore {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Test_Scenario_POST.Post_Request.class);
		System.out.println("Test Case Count : " +result.getRunCount());
		System.out.println("Failure Count : " +result.getFailureCount());
		
	}

}