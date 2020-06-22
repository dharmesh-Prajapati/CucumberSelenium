Feature: Customer

  Scenario: Add new customer
    Given user launch browser
    When user opens url "http://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    When user click on customers menu
    And click on customer menu item
    And click on add new button
    Then user can add new customer page
    When user enter customer info
    And click on save button
    Then user get confirmation message "The new customer has been added successfully."
    And close browser

  Scenario: Search by customer by email id
  Given user launch browser
    When user opens url "http://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    When user click on customers menu
    And click on customer menu item
    And Enter customer email
    And click on search button
    Then user details in search table
    And close browser