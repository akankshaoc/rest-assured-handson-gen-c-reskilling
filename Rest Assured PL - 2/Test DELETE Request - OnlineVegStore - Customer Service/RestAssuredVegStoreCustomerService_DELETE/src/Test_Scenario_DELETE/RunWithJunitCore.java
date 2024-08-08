// Please do no the change the implementation

package Test_Scenario_DELETE;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunWithJunitCore {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Test_Scenario_DELETE.Delete_Request.class);
		System.out.println("Test Case Count : " +result.getRunCount());
		System.out.println("Failure Count : " +result.getFailureCount());
		
	}

}
