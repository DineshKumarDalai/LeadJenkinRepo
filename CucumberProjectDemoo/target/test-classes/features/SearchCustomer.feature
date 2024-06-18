Feature: Email Search page functionality

Background: Below are common steps for every scenario
    Given User Launches Chrome Browser
    Then User Enter url "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title is "Dashboard / nopCommerce administration"

  @tag4
  Scenario: Search a customer by Email
    Given User can view the DashBoard
    Then User click customers under customers Tab
    When User is on Search Page
    Then User enater the Email in Email Search box
    When User click on search button
    Then User will see the searched email is display on tabular format
