import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    RegistrationPage registrationPage = new RegistrationPage(driver);
    HomePage homePage;
    @FindBy(css = "body > div > form > div > h4 > a")
    WebElement buttonSukurtinaujapaskyra;

    @FindBy(css = "#username")
    WebElement inputUsername;
    @FindBy(css = "#password")
    WebElement inputPassword;
    @FindBy(css = "#passwordConfirm")
    WebElement inputConfirmPassword;
    @FindBy(css = "#userForm > button")
    WebElement sukurtiButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        inputUsername.sendKeys(username);
    }
    public void enterPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void enterConfirmPassword(String password){
        inputConfirmPassword.sendKeys(password);
    }
    public void clickButtonSukurti(){sukurtiButton.click();}
}
