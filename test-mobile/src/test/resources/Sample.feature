Feature: MoneyLover Mobile Customer Onboarding Test Automation

  Background: The app is installed to the device or emulator and user launches the app,
  and buttons for new user and returning user appears
    Given user launches the application
    Then "NEW_TO_MONEY_LOVER" should be displayed and enabled
    Then "ALREADY_USING_MONEY_LOVER" should be displayed and enabled

  @Tag
  Scenario: Sample scenario
    Given user clicks "NEW_TO_MONEY_LOVER" button