package stepdefinitions;

import static stepdefinitions.ElementUtils.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

  @Given("^user launches the application$")
  public void user_launches_the_application() { }

  //Assertations
  @Then("^\"([^\"]*)\" should be displayed and enabled$")
  public static void isButtonDisplayedAndEnabled(String buttonText) { isElementDisplayedAndEnabled(buttonText); }

  @Then("^button \"([^\"]*)\" should be displayed and enabled$")
  public static void isButtonDisplayedAndEnabled1(String buttonText) {
    isElementDisplayedAndEnabled(buttonText);
  }
  @Then("user should proceed {string} screen")
  public void userShouldProceedScreen(String arg0) {
    isElementDisplayedAndEnabled(arg0);
  }

  @Then("user should see {string} button")
  public void userShouldSeeButton(String arg0) {
    isElementDisplayedAndEnabled(arg0);
  }

  @Then("user should see {string} form")
  public void userShouldSeeForm(String arg0) {
    isElementDisplayedAndEnabled(arg0);
  }

  @And("user should see {string} field")
  public void userShouldSeeField(String arg0) {
    isElementDisplayedAndEnabled(arg0);
  }

  @And("user should see {string} message")
  public void userShouldSeeMessage(String arg0) {
    isElementDisplayedAndEnabled(arg0);
  }

  @Then("user should see {string} dashboard")
  public void userShouldSeeDashboard(String arg0) { isElementDisplayedAndEnabled(arg0); }

  @Then("^\"([^\"]*)\" should be disabled$")
  public static void isButtonDisabled(String buttonText) { isElementDisabled(buttonText); }

  @And("{string} should not be {string} until all fields are populated")
  public void shouldNotBeUntilAllFieldsArePopulated(String buttonText, String expected) { isElementEnabledConditional(buttonText, expected); }

  @And("{string} should be editable")
  public void shouldBeEditable(String elementId) { isEditable(elementId); }

  @And("{string} field should contain {string}")
  public void fieldShouldContain(String fieldName, String sampleText) { elementShouldContain(fieldName, sampleText); }

  //Submit button should be grey
  @And("{string} should be {string}")
  public void shouldBe(String arg0, String arg1) { }

  //Clicks and taps
  @Given("^user clicks \"([^\"]*)\" button$")
  public static void userClicksButton(String buttonText) { userClicksElement(buttonText); }

  @Given("^user clicks \"([^\"]*)\" link")
  public static void userClicksLink(String linkText) { userClicksElement(linkText); }

  @Then("user clicks {string} option")
  public void userClicksOption(String optionText) { userClicksElement(optionText); }

  //Send keys
  @When("^user enters \"([^\"]*)\" to \"([^\"]*)\" area$")
  public static void userEntersToArea(String value, String area) { userEntersValuesToElement(value, area); }

  @When("user enters {string} values to {string} area")
  public void userEntersRandomToArea(String param, String area) { userEntersRandomToElement(param, area); }

  //Misc
  @When("image is captured")
  public void imageIsCaptured() { isImageCaptured(); }

}