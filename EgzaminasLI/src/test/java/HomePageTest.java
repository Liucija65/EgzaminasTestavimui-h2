import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BasePageTest {
    HomePage homePage = new HomePage(driver);
    RegistrationPage registrationPage;


    @Test
    @Order(1)
    void testAccountButtonFormLogin() {

        HomePage homePage = new HomePage(driver);
        driver.get("http://localhost:8080/prisijungti");
    }

    @Test
    @Order(2)
    void testCreateAccountButton() {

        HomePage homePage = new HomePage(driver);
        driver.get("localhost:8080/registruoti");

        homePage.clickButtonSukurtinaujapaskyra();
        homePage.enterUsername("Testas11");
       homePage.enterPassword("Testas11.123");
        homePage.enterConfirmPassword("Testas11.123");
        homePage.clickButtonSukurti();
    }
    @Test
    @Order(3)
    void testInvalidData(){
        HomePage homePage = new HomePage(driver);
        driver.get("localhost:8080/registruoti");
        homePage.clickButtonSukurtinaujapaskyra();
        homePage.enterUsername("12 $345");
        homePage.enterPassword("1 2 3");
        homePage.enterConfirmPassword("12345");
        homePage.clickButtonSukurti();

    }

    }








