package appiumTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer  implements IRetryAnalyzer{
     int cnt =0;
     int  maxTry=2;
	@Override
	public boolean retry(ITestResult result) {
		if(cnt<maxTry) {
			cnt++;
			return true;
		}
		return false;
	}
}
