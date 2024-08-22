import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends BasePageTest {
    RegistrationPage registrationPage = new RegistrationPage(driver);

    HomePage homePage;

    @Test
        //@Order(3)
    void fillSuccessfulRegisterForm() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        driver.get("localhost:8080/registruoti");

    }

    @Test
        // @Order(4)
    void testReistationForm() {
        RegistrationPage registrationPage =
                new RegistrationPage(driver);
        registrationPage.enterUsername("Testas2");
        registrationPage.enterPassword("Testas.123");
        registrationPage.enterConfirmPassword("Testas.123");
        registrationPage.clickButtonSukurti();
    }
}
