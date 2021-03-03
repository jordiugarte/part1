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
    And yo espero el response body sea
    """
    {
        "Id": "IGNORE",
        "Content": "EXTERNAL FILE",
        "ItemsCount": 0,
        "Icon": 4,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [

        ],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """
    And yo obtengo el Id y lo guardo en ID_PROJECT
    When yo envio una peticion PUT al url http://todo.ly/api/projects/ID_PROJECT.json con json
    """
    {
      "Content":"EXTERNAL FILE",
      "Icon":"4"
    }
    """
    Then yo espero que el codigo de respuesta sea 200
    And yo espero el response body sea
    """
    {
        "Id": ID_PROJECT,
        "Content": "EXTERNAL FILE",
        "ItemsCount": 0,
        "Icon": 4,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [

        ],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """
    When yo envio una peticion GET al url http://todo.ly/api/projects/ID_PROJECT.json con json
    """
    """
    Then yo espero que el codigo de respuesta sea 200
    And yo espero el response body sea
    """
   {
        "Id": ID_PROJECT,
        "Content": "EXTERNAL FILE",
        "ItemsCount": 0,
        "Icon": 4,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [

        ],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """
    When yo envio una peticion DELETE al url http://todo.ly/api/projects/ID_PROJECT.json con json
    """
    """
    Then yo espero que el codigo de respuesta sea 200
    And yo espero el response body sea
    """
    {
        "Id": ID_PROJECT,
        "Content": "EXTERNAL FILE",
        "ItemsCount": 0,
        "Icon": 4,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [

        ],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": true,
        "SyncClientCreationId": null
    }
    """
