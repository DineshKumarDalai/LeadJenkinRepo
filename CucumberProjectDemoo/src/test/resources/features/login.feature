Feature: Nopcommerce Application Funtionality

  @tag1
  Scenario: Nopcommerce Login Funtionality
    Given User Launches Chrome Browser
    Then User Enter url "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title is "Dashboard / nopCommerce administration"
    Then User click logout button
    Then After logout Page Title should be "Your store. Login"

  @tag2
  Scenario Outline: Nopcommerece Login with Different Credential
    Given User Launches Chrome Browser
    Then User Enter url "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "<username>" and password as "<Password>"
    And Click on Login
    Then Page Title is "Dashboard / nopCommerce administration"
    Then User click logout button
    Then After logout Page Title should be "Your store. Login"

    Examples: 
      | username            |   Password |
      
      | abc@yourstore.com   |   abc      |
      | xyz@yourstore.com   |   xyz      |
      | admin@yourstore.com |   admin    |
