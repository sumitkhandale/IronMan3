package secondsegment;

import org.testng.annotations.Test;

public class HomePage {
  @Test
  public void Search_option() {
	  System.out.println("The search option allows alpha numeric character");
  }
  @Test
  public void Menue_Option() {
	  System.out.println("The menue display all required products");
  }
  
  @Test
  public void Product_Tab() {
	  System.out.println("On clicking product tab,the image of product gets display");
  }
  @Test
  public void Customer_review() {
	  System.out.println("The link and reviews are displayed under each products");
  }
}
