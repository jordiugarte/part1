Feature: Project

  #este es un comentario
  @Projectos
  Scenario: As admin user
            I want to create, update and delete a project
            So that i am able to manipulate the project

    Given yo tengo acceso al Todo.ly
    When yo envio una peticion POST al url http://todo.ly/api/projects.json con json
    """
    {
      "Content":"EXTERNAL FILE",
      "Icon":"4"
    }
    """
    Then yo espero que el codigo de respuesta sea 200
    And yo espero que el nombre del project sea "EXTERNAL FILE"
