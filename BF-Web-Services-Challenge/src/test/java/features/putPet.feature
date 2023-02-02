Feature: Put Pet

  Scenario Outline: Modificar una mascota existente mediante PUT al path /v2/pet
    Given user update the category and the name <name> and the tags and the status of the pet with petId <petId> through PUT operation
    Then response of PUT operation is status code <statusCode>
    And validate PUT schema of response

    Examples:
      | name  | petId | statusCode |
      | "rengar3"  | 30  | 200        |
