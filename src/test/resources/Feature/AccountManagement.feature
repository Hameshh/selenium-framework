@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address

    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | FirstName | LastName | Email              | Password | ConfirmPassword |
      | John      | Doe      | Johndoe@yahoo.com | John1234 | John1234        |

  @DuplicateAccount
  Scenario Outline: Duplicate account creation not allowed

    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then An error message saying Existing customer with an account error message should be displayed


    Examples:
      | FirstName | LastName | Email              | Password | ConfirmPassword |
      | John      | Doe      | Johndoe@yahoo.com | John1234 | John1234        |


  @RegisteredCustomer
  Scenario Outline: Registered customer to use username and password

    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | FirstName | LastName | Email              | Password | ConfirmPassword |
      | John      | Doe      | Johndoe@yahoo.com | John1234 | John1234        |

    @UnregisteredCustomer
    Scenario Outline: Unregistered customer to see error if attempting to login

      Given I am on sign in page
      When I enter "<Email>" "<Password>"
      And I click on sign in
      Then Error message should be displayed


      Examples:
        | Email               | Password  |
        | Daviddean1@yahoo.com | David1234 |

  @AccountLock
  Scenario Outline: Account to be locked after maximum of 5 attempts

   //call the create an account action already created here to avoid repetition
    Given I am on sign in page
    And I enter "<Email>" "<Password>"
    And I click on sign in
    When I repeat entering "<Email>" "<Password>" and Click Sign in four more times
    Then Account should be locked with an error message displayed

    Examples:
      | Email                | Password  |
      | Daviddean1@yahoo.com | David1234 |

  @ViewMyOrderHistory
  Scenario Outline: Have at least one order available to view history
    Given I am on create an account page
    And I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    And On my account page I click on What's New tab
    And I click on product link Echo compression Fit short
    And I click on product Size 28
    And I click on colour black
    And I click on Add to cart button
    And I click on the cart icon
    And I click on the Proceed to checkout button
    And On Checkout Page I enter "<Address>" "<State>" "<PostalCode>" "<PhoneNumber>"
    And I pick Flat rate
    And I click on Next Button
    When I click on Place Order Button
    And I click on My Account from profile drop down menu
    And I click on My Orders
    Then Order History should be displayed

    Examples:
      | FirstName | LastName | Email             | Password | ConfirmPassword | Address     | Country | State      | PostalCode | PhoneNumber |
      | John      | Doe      | Johndoe@yahoo.com | John1234 | John1234        | 222 Lily rd | USA     | Danny Lane | 2323       | 222333444   |



















