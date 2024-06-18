Feature: Add a Customer on NopE-Comerece

  Background: Below are common steps for every scenario
    Given User Launches Chrome Browser
    Then User Enter url "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title is "Dashboard / nopCommerce administration"

  @tag3
  Scenario: Add Customer
    Given User can view DashBoard
    Then click customers under customers Tab
    And click AddNew button
    Then Fill All the fields
    Then Click on Save Button
    Then User can view Confirmation message "The new Customer has been added sucessfully."
