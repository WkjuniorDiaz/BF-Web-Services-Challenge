Feature: POST Pet

  Scenario Outline: Agregar una mascota realizando un POST al path/v2/pet.
    Given user add a pet with petId <petId> and category and name of the pet <petName> and tags and status through POST operation
    Then response of POST is status code <statusCode>
    And validate POST schema of response
    Examples:
      | petId | petName | statusCode |
      | 44    | "nidaly"  | 200        |