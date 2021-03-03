Feature: Project

  # variables debemos usar simbolos de <NOMBRE DE LA VARIABLE>

  @Projectos
  Scenario Outline: As admin user
  I want to create, update and delete a project
  So that i am able to manipulate the project

    Given yo tengo acceso al Todo.ly
    When yo envio una peticion POST al url http://todo.ly/api/projects.json con json
    """
    {
      "Content":"<nombreProject>",
      "Icon":"<iconProject>"
    }
    """
    Then yo espero que el codigo de respuesta sea 200
    And yo espero que el nombre del project sea "<nombreProject>"

    Examples:
      | nombreProject  | iconProject  |
      | EynarCucumber1 | 1            |
      | EynarCucumber2 | 2            |
      | EynarCucumber3 | 3            |
      | EynarCucumber4 | 4            |

