

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.hyr.BaseTest;

public class TablesTest extends BaseTest {
    public static void main(String[] args) {
        TablesTest test = new TablesTest();
        test.runTest();
    }

    public void runTest() {
        // Start browser
        setUp();

        // Open Table Page
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        // Locate the table
        WebElement table = driver.findElement(By.id("contactList"));

        // Get all rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        System.out.println("Total Rows: " + rows.size());

        // Loop through rows
        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < cols.size(); j++) {
                System.out.print(cols.get(j).getText() + " | ");
            }
            System.out.println();
        }

        System.out.println("Table Data Printed Successfully");

        // End test
        tearDown();
    }
}
