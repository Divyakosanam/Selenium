import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.hyr.BaseTest;
import java.time.Duration;

public class WaitsTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        WaitsTest test = new WaitsTest();
        test.runTest();
    }

    public void runTest() throws InterruptedException {
        // Start browser
        setUp();

        // Open Waits Demo page
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        Thread.sleep(1000);

        // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Click on "Add Textbox1" button
        driver.findElement(By.xpath("//button[@id='btn1']")).click();

        // Wait for Textbox1 input to be visible and enter text
        WebElement textbox1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt1']")));
        textbox1.sendKeys("Textbox 1");
        Thread.sleep(1000);

        // Click on "Add Textbox2" button
        driver.findElement(By.xpath("//button[@id='btn2']")).click();

        // Wait for Textbox2 input to be visible and enter text
        WebElement textbox2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt2']")));
        textbox2.sendKeys("Textbox 2");
        Thread.sleep(1000);

        System.out.println("Waits Demo Test Completed Successfully");

        // End test
        tearDown();
    }
}
