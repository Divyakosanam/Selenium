

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.hyr.BaseTest;

public class XpathTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
    	XpathTest test = new XpathTest();
        test.runTest();
    }

    public void runTest() throws InterruptedException {
        // Start browser
        setUp();

        // Open registration form page
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        
        Thread.sleep(1000);

        // First Name (attribute)
        WebElement firstName = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
        firstName.sendKeys("Divya");
        
        Thread.sleep(1000);


        // Last Name (contains)
        WebElement lastName = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
        lastName.sendKeys("Kosanam");
        
        Thread.sleep(1000);


        // Email (starts-with)
        WebElement email = driver.findElement(By.xpath("//input[@type='text' and @required]"));
        email.sendKeys("divya@example.com");
        
        Thread.sleep(1000);


        // Password (attribute)
        WebElement password = driver.findElement(By.xpath("(//input[@type='password' and @required])[1]"));
        password.sendKeys("Password123");
        
        Thread.sleep(1000);


        // Confirm Password (attribute)
        WebElement confirmPassword = driver.findElement(By.xpath("(//input[@type='password' and @required])[2]"));
        confirmPassword.sendKeys("Password123");
        
        System.out.println("Success");
        
        Thread.sleep(1000);

        
        //Click submit
        WebElement sub = driver.findElement(By.xpath("//button[@type='submit' and text()='Register']"));
        sub.click();
        System.out.println(sub.getText());

        Thread.sleep(1000);


        System.out.println("Registration Form Filled");

        // End test
        tearDown();
    }
}
