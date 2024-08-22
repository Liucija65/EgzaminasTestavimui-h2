import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //palaukti kol uzsikraus puslapis;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

     // Prisijungti prie registracijos puslapio;
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

     // Cia radau naujo iraso lokatoriu;
   // @FindBy(css = "#sk1")
   // WebElement inputNumber;







    public void clickButtonSukurtinaujapaskyra() {
        buttonSukurtinaujapaskyra.click();
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

   // public String getNumber(){
      //  return inputNumber.getText();
  //  }




}