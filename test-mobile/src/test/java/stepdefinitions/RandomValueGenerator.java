package stepdefinitions;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValueGenerator {

  public static void main(String[] args) {
    //Test all random generator methods
    System.out.println("Email :" + randomValues("RANDOM_VALID_EMAIL"));
    System.out.println("Password :" + randomValues("RANDOM_VALID_PASSWORD"));
    System.out.println("Full Legal Name :" + randomValues("RANDOM_VALID_FULL_LEGAL_NAME"));
    System.out.println("Phone :" + randomValues("RANDOM_VALID_PHONE"));
    System.out.println("Postcode :" + randomValues("RANDOM_VALID_POSTCODE"));
    System.out.println("Error Message Test :" + randomValues("Wrong param"));
  }

  public static String randomValues(String param) {
    String randomValue1 = "";

    //To generate a valid random email
    if (param.equals("RANDOM_VALID_EMAIL")) {
      String name = RandomStringUtils.random(10, true, true);
      String domain = RandomStringUtils.randomAlphabetic(7);
      String ext = RandomStringUtils.randomAlphabetic(4);
      randomValue1 = name + "@" + domain + "." + ext;
    }
    //To generate a valid random password
    else if (param.equals("RANDOM_VALID_PASSWORD")) {
      randomValue1 = RandomStringUtils.random(8, true, true);
    }
    //To generate a valid name and surname
    else if (param.equals("RANDOM_VALID_FULL_LEGAL_NAME")) {
      String firstName = RandomStringUtils.randomAlphabetic(7);
      String lastName = RandomStringUtils.randomAlphabetic(7);
      randomValue1 = firstName + " " + lastName;
    }
    //To generate a valid phone number
    else if (param.equals("RANDOM_VALID_PHONE")) {
      randomValue1 = RandomStringUtils.randomAlphanumeric(11);
    }
    //To generate a valid UK post code
    else if (param.equals("RANDOM_VALID_POSTCODE")) {
      String postCode1 = RandomStringUtils.randomAlphabetic(2);
      String postCode2 = RandomStringUtils.randomAlphanumeric(2);
      String postCode3 = RandomStringUtils.randomAlphabetic(2);
      randomValue1 = postCode1 + postCode2 + postCode3;
    } else {
      randomValue1 = "Check your feature file. You entered an invalid random value type!";
      System.out.println("Check your feature file. You entered an invalid random value type!");
    }
    return randomValue1;
  }

}