Feature:
Feature: Token

  @Token
  Scenario: As Admin
  I want to get and delete token
  so that I can handle tokens

    Given I got access to todoly

    When I send the GET request to url http://todo.ly/api/authentication/token.json
    And I get a property TokenString and save it in TokenValue
    Then I expect a response body
    """
    {
      "TokenString": TokenValue,
      "UserEmail": "jordi@ugarte.com",
      "ExpirationTime": "IGNORE"
    }
    """

    When I send the DELETE request to url http://todo.ly/api/authentication/token.json
    Then I expect a response body
    """
    {
      "TokenString": TokenValue,
      "UserEmail": "jordi@ugarte.com",
      "ExpirationTime": "IGNORE"
    }
    """