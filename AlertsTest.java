

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import com.hyr.BaseTest;

public class AlertsTest extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        AlertsTest test = new AlertsTest();
        test.runTest();
    }

    public void runTest() throws InterruptedException {
        // Start browser
        setUp();

        // Open Alerts Demo page
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        
        // 1. Simple Alert
        Thread.sleep(1000);
        driver.findElement(By.id("alertBox")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        
        Thread.sleep(1000);
        simpleAlert.accept(); // Click OK

        // 2. Confirm Alert
        Thread.sleep(1000);
        driver.findElement(By.id("confirmBox")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + confirmAlert.getText());
        
        Thread.sleep(1000);
        confirmAlert.dismiss(); // Click Cancel

        // 3. Prompt Alert
        Thread.sleep(1000);
        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        
        Thread.sleep(1000);
        promptAlert.sendKeys("Divya here!"); // Enter text
        
        Thread.sleep(1000);
        promptAlert.dismiss(); // Click OK
        
        Thread.sleep(1000);

        // End test
        tearDown();
    }
}
