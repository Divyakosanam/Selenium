import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.hyr.BaseTest;
import java.time.Duration;
import java.util.Set;

public class WindowHandlesTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        WindowHandlesTest test = new WindowHandlesTest();
        test.runTest();
    }

    public void runTest() throws InterruptedException {
        // Start browser
        setUp();

        // Open Window Handles Practice page
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        Thread.sleep(1000);

        // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Store the parent window handle
        String parentWindow = driver.getWindowHandle();

        // Click the "Click Me!" button to open a new window
        driver.findElement(By.id("newWindowBtn")).click();

        // Wait for the new window to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to the new window
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Perform actions in the new window
        WebElement heading = driver.findElement(By.tagName("h1"));
        System.out.println("Heading in new window: " + heading.getText());
        Thread.sleep(1000);

        // Close the new window
        driver.close();

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);

        // Perform actions in the parent window
        WebElement parentHeading = driver.findElement(By.tagName("h1"));
        System.out.println("Heading in parent window: " + parentHeading.getText());
        Thread.sleep(1000);

        System.out.println("Window Handles Test Completed Successfully");

        // End test
        tearDown();
    }
}
