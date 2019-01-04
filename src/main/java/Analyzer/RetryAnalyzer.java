package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int counter = 0;
	int maxtry=1;
	public boolean retry(ITestResult result) {
		
		if(counter<maxtry) {
			counter++;
			return true;
		}
		return false;
	}

}
