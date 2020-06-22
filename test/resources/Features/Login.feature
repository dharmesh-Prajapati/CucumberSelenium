Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given user launch browser
    When user opens url "http://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And user click on Login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on Logout link
    Then page title should be "Your store. Login"
    And close browser
