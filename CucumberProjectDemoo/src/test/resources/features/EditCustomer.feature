
Feature: Edit a Customer

 Background: Below are common steps for every scenario
    Given User Launches Chrome Browser
    Then User Enter url "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title is "Dashboard / nopCommerce administration"

  @tag5
  Scenario: Edit a Customer
    Given User view DashBoard
    Then User click customers under customers menu
    And User Enter email in Search email textbox
    Then click on Search button
    Then click on edit button on the result email table
    Then user will see the Edit customer details
    And User edit the last name
    And user edit the Gender field
    Then User click on save button
    


