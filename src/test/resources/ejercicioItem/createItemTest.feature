Feature: Item
  Scenario: As a user I want to create an item so that check my status

    Given yo tengo acceso al Todo.ly
    When yo envio una peticion POST al url http://todo.ly/api/items.json con json
    """
    {
      "Content":"Item Cucumber"
    }
    """
    Then yo espero que el codigo de respuesta sea 200
    And yo espero que el nombre del item sea "Item Cucumber"