package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softAssert = new SoftAssert();
	
  @Test(priority = 1, groups = {"smoke", "sanity"})//create new user test@tet.com
  public void createuser() {
	  
	  System.out.println("I m in home test");
      System.out.println("before assertion");
	  Assert.assertTrue(2>3, "Verifying element");//we use regular assert in industry
	  System.out.println("after assertion");
	  Assert.assertEquals("abc", "abc");
	  
  }
  
  @Test(priority = 2, dependsOnMethods = "createuser")//edit user test@test.com
  public void edituser() {
	  
      System.out.println("before assertion");
	  softAssert.assertTrue(2>3, "Verifying element");
	  System.out.println("after assertion");
	  softAssert.assertAll();
  }
  
  @Test(priority = 3, dependsOnMethods = "edituser")//delete user test@test.com
  public void deleteuser() {
	  System.out.println("I m in end test");
      System.out.println("before assertion");
	  softAssert.assertTrue(2>3, "Verifying element");//we use regular assert in industry
	  System.out.println("after assertion");
	  softAssert.assertEquals("abc", "abc");
	  System.out.println("After 2nd assert");
      softAssert.assertAll();
 }
}
