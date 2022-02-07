package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Pages {
    public Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//div[@class='card-up'])[1]")
     public WebElement alert;
    @FindBy(xpath="(//div[@class='header-wrapper'])[3]")
     public WebElement alert1;
    @FindBy(xpath="(//div[@class='header-wrapper'])[1]")
     public WebElement element;
    @FindBy(xpath="//span[text()='Alerts']")
    public WebElement alert2;
    @FindBy(id="alertButton")
    public WebElement clickButton;
    @FindBy(id="timerAlertButton")
    public WebElement timerClickButton;
    @FindBy(id="confirmButton")
    public WebElement confirmClickButton;
    @FindBy(id="promtButton")
    public WebElement promptClickButton;
    @FindBy(xpath="(//div[@class='header-text'])[5]")
    public WebElement interactions;
    @FindBy(xpath="//span[text()='Droppable']")
    public WebElement droppable;
    @FindBy( id="draggable")
    public WebElement dragMe;
    @FindBy(id="droppable")
    public WebElement dropHere;
    @FindBy(xpath="(//div[@class='header-text'])[4]")
    public WebElement widgets;
    @FindBy(xpath="//span[text()='Tool Tips']")
    public WebElement toolTips;
    @FindBy(xpath="//button[@id='toolTipButton']")
    public WebElement hoverMe;
    @FindBy(xpath="//input[@id='toolTipTextField']")
    public WebElement hoverMeText;
    @FindBy(xpath="//div//p[text()='Dropped!']")
    public WebElement dragDrop;

//    public void alert() {
//        Driver.getDriver().get(ConfigReader.getProperty("browser"));
//        Pages pages = new Pages();
//        pages.alert.click();
//        pages.alert1.click();
//        pages.alert2.click();
//    }

}
