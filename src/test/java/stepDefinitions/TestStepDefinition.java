package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class TestStepDefinition {
    Pages pages=new Pages();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Alerts click")
    public void alerts_click() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        pages.alert.click();
        Thread.sleep(2000);
        pages.element.click();
        Thread.sleep(2000);
        pages.alert1.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        pages.alert2.click();

            String firstHandle = Driver.getDriver().getWindowHandle();
            for (String w : Driver.getDriver().getWindowHandles()) {
                String secondHandle=" ";
                if (!w.equals(secondHandle)) {
                    Driver.getDriver().switchTo().window(w);
                }
            }
            Driver.getDriver().switchTo().window(firstHandle);
    }

    @Given("Handle all alerts")
    public void handle_all_alerts() throws InterruptedException {
        Thread.sleep(2000);
        pages.clickButton.click();
        Driver.getDriver().switchTo().alert().accept();
        pages.timerClickButton.click();
        Thread.sleep(6000);
        Driver.getDriver().switchTo().alert().accept();
        pages.confirmClickButton.click();
        Driver.getDriver().switchTo().alert().dismiss();
        Thread.sleep(3000);
        actions.doubleClick(pages.promptClickButton).perform();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().alert().dismiss();
    }
    @Then("Interactions")
    public void interactions() throws InterruptedException {
        pages.alert1.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        pages.interactions.click();}
    @Then("Click droppable button")
    public void click_droppable_button() throws InterruptedException {
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.droppable.click();}
    @Then("Under the simple module drag the “drag me” box to the “drop me” box  and verify that dropped")
    public void under_the_simple_module_drag_the_drag_me_box_to_the_drop_me_box_and_verify_that_dropped() throws InterruptedException {
        Thread.sleep(2000);
        actions.dragAndDrop(pages.dragMe,pages.dropHere).perform();
        Assert.assertTrue(pages.dragDrop.isDisplayed());
        }
    @Then("Widgets click")
    public void widgets_click() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        pages.interactions.click();
    }
    @Then("Click tool Tips button")
    public void click_tool_tips_button() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",pages.toolTips);
//        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.widgets.click();
        Thread.sleep(3000);
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        WebElement toolT = (WebElement) js.executeScript(
//                "document.querySelector(\"#item-6\")");
//        toolT.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pages.toolTips.click();
        Thread.sleep(3000);
        }
    @Then("Hover over the “Hover me to see” button and verify the “You Hovered Over the button” message")
    public void hover_over_the_hover_me_to_see_button_and_verify_the_you_hovered_over_the_button_message() {
        actions.moveToElement(pages.hoverMe);
        Assert.assertEquals("Hover me to see",pages.hoverMe.getText());
    }
    @Then("Hover over the “Hover me to see” text field and verify “You hovered the text field” message.")
    public void hover_over_the_hover_me_to_see_text_field_and_verify_you_hovered_the_text_field_message() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(pages.hoverMeText).perform();
        Assert.assertTrue(pages.hoverMeText.isDisplayed());
    }
}
