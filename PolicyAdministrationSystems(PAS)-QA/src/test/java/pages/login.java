package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class login {
    public login(){
        PageFactory.initElements(Driver.getInstance(), this);
    }
private WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 15);
    @FindBy(xpath = "//input[@name='txtUsername']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='txtPassword']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement login;
}
