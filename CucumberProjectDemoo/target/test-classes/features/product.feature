Feature: Product feature page

 Background: Below are common steps for every scenario
    Given User Launches Chrome Browser
    Then User Enter url "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title is "Dashboard / nopCommerce administration"
  

  @tag6
  Scenario: Verify Product details table
    Given User will see the catalog menu in menu bar
    Then User click product under catalog menu
    Then user verify the product table
