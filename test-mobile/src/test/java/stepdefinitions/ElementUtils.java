package stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static stepdefinitions.InitializeTest.driver;
import static stepdefinitions.InitializeTest.elementIds;
import static stepdefinitions.RandomValueGenerator.randomValues;


public class ElementUtils {

  //Assertations
  public static void isElementDisplayedAndEnabled(String buttonText) {
    String id = elementIds.getProperty(buttonText);
    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    boolean isDisplayed = driver.findElement(By.id(id)).isDisplayed();
    Assert.assertTrue(isDisplayed);
    boolean isEnabled = driver.findElement(By.id(id)).isEnabled();
    Assert.assertTrue(isEnabled);
  }

  public static void isElementDisabled(String buttonText) {
    String id = elementIds.getProperty(buttonText);
    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    boolean isEnabled = driver.findElement(By.id(id)).isEnabled();
    Assert.assertTrue(isEnabled);
  }

  public static void isElementEnabledConditional(String buttonText, String expected) {
    String id = elementIds.getProperty(buttonText);
    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    boolean isEnabled = driver.findElement(By.id(id)).isEnabled();
    Assert.assertEquals(isEnabled, expected);
  }

  public static void isEditable(String elementId) {
    String id = elementIds.getProperty(elementId);
    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    boolean isEnabled = driver.findElement(By.id(id)).isEnabled();
    Assert.assertTrue(isEnabled);
    driver.findElement(By.id(id)).clear();
    driver.findElement(By.id(id)).sendKeys("Editing");
  }

  public static void elementShouldContain(String fieldName, String sampleText) {
    String id = elementIds.getProperty(fieldName);
    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    String actualText =  driver.findElement(By.id(id)).getText();
    Assert.assertEquals(sampleText,actualText);
  }


  //Clicks and taps
  public static void userClicksElement(String elementText) {
    String id = elementIds.getProperty(elementText);
    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    driver.findElementById(id).click();
  }

  //Send keys
  public static void userEntersValuesToElement(String value, String area) {
    String id = elementIds.getProperty(area);
    boolean isDisplayed = driver.findElement(By.id(id)).isDisplayed();
    Assert.assertEquals(isDisplayed, true);
    driver.findElement(By.id(id)).sendKeys(value);
  }


  //To be developed
  public static void isImageCaptured() {

  }

  //Ready to use
  public static void userEntersRandomToElement(String param, String area) {
    String id = elementIds.getProperty(area);
    boolean isDisplayed = driver.findElement(By.id(id)).isDisplayed();
    Assert.assertEquals(isDisplayed, true);
    String newText = randomValues(param);
    driver.findElement(By.id(id)).sendKeys(newText);
  }

  public static void userShouldNotBeAllowedToLeaveViewHelper(String view) {
    //The main idea here is to check whether user leaved the activity by checking visibility of an element located in the current activity
    //Implicitly wait because I want to be sure that i gave enough time after user clicks register
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    String id = elementIds.getProperty(view);
    boolean isDisplayed = driver.findElement(By.id(id)).isDisplayed();
    Assert.assertEquals(isDisplayed, true);
    System.out.println(isDisplayed);
  }

}