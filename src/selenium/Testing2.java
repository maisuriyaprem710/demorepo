package selenium;

import org.testng.annotations.Test;

public class Testing2 {
	 @Test(groups = "sanity")
	  public void test3() {
		  System.out.println("Test3");
	  }
	 
	 @Test(groups = "smoke")
	  public void test4() {
		  System.out.println("Test4");
	  }
}
