Feature: Put Pet

  Scenario Outline: Modificar una mascota existente mediante PUT al path /v2/pet
    Given user update the name <name> of the pet with petId <petId> through PUT operation
    Then response of PUT operation is status code <statusCode>

    Examples:
      | name  | petId | statusCode |
      | "rengar1"  | 30  | 200        |
