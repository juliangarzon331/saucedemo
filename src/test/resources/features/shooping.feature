Feature: Shopping Cart

  Scenario Outline: Adding items to shopping cart
    Given I am on the shopping website
    When I add "<item>" to my cart
    Then my cart should display "<item>" with price "<price>"

    Examples:
      | name     | value |
      | lastName | value |
      | phone    | $50   |
      | age      | $80   |


  Scenario Outline: Registering a new user
    Given I am on the registration page
    When I enter my "<first_name>", "<last_name>", "<email>", "<password>", and "<phone_number>"
    And I click the submit button
    Then my account should be created successfully

    Examples:
      | first_name | last_name   | email                   | password    | phone_number |
      | John       | Doe     | john.doe@example.com    | Pa$$w0rd123 | 555-123-4567 |
      | Jane       | Smith   | jane.smith@example.com  | P@ssword123 | 555-987-6543 |
      | Bob        | Johnson | bob.johnson@example.com | Password123 | 555-555-1212 |


  Scenario: Adding multiple products to inventory
    Given I am on the inventory management page
    When I add the following products:
      | Product A | SKU123 | $20 |
    Then the inventory should display all added products