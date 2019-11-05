##CUCUMBER-APPIUM PROJECT TO TEST CROSS PLATFORM APPS
Two folders are created under the "test' folder. These are A- ‘resources’ folder and B- ‘stepdefinitions’ folders
"resources" folder contains following files
 - "andoridIds.properties" file: The source ids of all mobile elements for Android devices are stored and mat
"iosIds.properties" file: The source ids of all mobile elements for IOS devices are stored and matched to a string value in this file.
ched to a string value in this file.

- ".feature" files: All Test Backgrounds, Scenarios and Scenario Outlines are written in Gherkin Syntax and they are stored in the ".feature" extended files in the resources folder.Test Scenarios can be tagged with "@" symbol which allows testers to select and run specific type/group of tests.All parameterised expressions should be written between quotation marks (“ ”).These parameters are mapped inside either the "androidIds.properties" file or "iosIds.properties" file.
 Gherkin syntax allows to use domain-specific language in a Given, When, Then format. The Given-When-Then syntax forces to think about ;
the current state of the system (the Given),
the action that is taken on the system (the When), and
the resulting behavior of the system (the Then).

- "stepdefinitions" folder contains following java classes (files);

- ElementUtils.jav: helper methods
- InitializeTest.java: Defining global variables and desired capabilities for Android and iOS devices
- RandomValueGenerator: Contains methods to create random values for test purposes
- RunTest.java: Includes cucumber options to run test and reporting
- StepDefinitions.java: glue codes
- TouchActions.java:helper methods

- Desired capabilities: One of the most important step of the mobile automation test is setting the desired capabilities on both Appium and Android Studio (or GenyMotion). After setting the desired capabilities, Appium Driver is initialized in InitializeTest.java file manually which is shown in the code block below. Below examples of desired capabilities that are necessary test are shown:

- Presiquities: Before running tests following files and information are needed.
A list of resource ids of all mobile elements
apk for  Android, and .app or .ipa for IOS 
Apple development team id (xcodeOrgId) and developer id (xcodeSigningId)
 -TOOLS
Cucumber, Appium, JUNIT, Android Studio, XCODE, Accesibility inspector