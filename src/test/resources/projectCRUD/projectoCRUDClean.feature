Feature: Project Clean

  #este es un comentario
  @Projectos
  Scenario: As admin user
  I want to create, update and delete a project
  So that i am able to manipulate the project

    Given I have access to Todo.ly
    When I send a request POST to url http://todo.ly/api/projects.json with json
    """
    {
      "Content":"EXTERNAL FILE",
      "Icon":"4"
    }
    """
    Then I expected response code 200
    And I expected the response body
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
    And I get the property Id save on ID_PROJECT
    When I send a request PUT to url http://todo.ly/api/projects/ID_PROJECT.json with json
    """
    {
      "Content":"EXTERNAL FILE",
      "Icon":"4"
    }
    """
    Then I expected response code 200
    And I expected the response body
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
    When I send a request GET to url http://todo.ly/api/projects/ID_PROJECT.json with json
    """
    """
    Then I expected response code 200
    And I expected the response body
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
    When I send a request DELETE to url http://todo.ly/api/projects/ID_PROJECT.json with json
    """
    """
    Then I expected response code 200
    And I expected the response body
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
