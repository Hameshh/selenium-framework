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
      | John      | Doe      | Johndoe2@yahoo.com | John1234 | John1234        |

  @DuplicateAccount
  Scenario Outline: Duplicate account creation not allowed

    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then An error message saying Existing customer with an account error message should be displayed


    Examples:
      | FirstName | LastName | Email              | Password | ConfirmPassword |
      | John      | Doe      | Johndoe2@yahoo.com | John1234 | John1234        |


  @RegisteredCustomer
  Scenario Outline: Registered customer to use username and password

    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | FirstName | LastName | Email              | Password | ConfirmPassword |
      | John      | Doe      | Johndoe2@yahoo.com | John1234 | John1234        |

    @UnregisteredCustomer
    Scenario Outline: Unregistered customer to see error if attempting to login

      Given I am on sign in page
      When I enter "<Email>" "<Password>"
      And I click on sign in
      Then Error message should be displayed


      Examples:
        | Email               | Password  |
        | Daviddean1@yahoo.com | David1234 |