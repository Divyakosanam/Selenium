

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.hyr.BaseTest;

public class LoginTest extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.runTest();
    }

    public void runTest() throws InterruptedException {
        // Start browser
        setUp();

        // Go to HYR Tutorials form page
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

        // Fill the form
        driver.findElement(By.id("firstName")).sendKeys("Divya");
        driver.findElement(By.id("lastName")).sendKeys("Kosanam");
        driver.findElement(By.id("femalerb")).click();
        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("email")).sendKeys("divya@example.com");
        driver.findElement(By.id("password")).sendKeys("password123");
        
        Thread.sleep(2000);
        // Submit form
        driver.findElement(By.id("registerbtn")).click();
        
        Thread.sleep(2000);

        // Capture success message
        WebElement msg = driver.findElement(By.id("msg"));
        System.out.println("Form Submission Message: " + msg.getText());

        // Close browser
        tearDown();
    }
}
