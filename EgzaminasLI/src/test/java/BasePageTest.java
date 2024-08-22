import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePageTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
      //  driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver.get("http://localhost:8080/prisijungti");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
       if(driver!=null){
           driver.quit();}
    }
}
