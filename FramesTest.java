
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.hyr.BaseTest;

public class FramesTest extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        FramesTest test = new FramesTest();
        test.runTest();
    }

    public void runTest() throws InterruptedException {
        // Start browser
        setUp();

        // Open Frames Practice page
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        // -------- Frame 1: Dropdown --------
        Thread.sleep(1000);
        
        driver.switchTo().frame("frm1");  // Frame 1
        WebElement dropdown = driver.findElement(By.id("course"));
        Select select = new Select(dropdown);
        select.selectByIndex(1); // select second option
        
        Thread.sleep(1000);
        System.out.println("Frame 1 Dropdown selected");
        driver.switchTo().defaultContent();

        // -------- Frame 2: Text Box --------
        Thread.sleep(1000);
        
        driver.switchTo().frame("frm2");  // Frame 2
        WebElement textBox = driver.findElement(By.id("firstName"));
        textBox.sendKeys("Divya");
        
        Thread.sleep(1000);
        System.out.println("Frame 2 TextBox filled");
        driver.switchTo().defaultContent();
        
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("Parent Frame");
        
        Thread.sleep(1000);

        // End test
        tearDown();
    }
}
