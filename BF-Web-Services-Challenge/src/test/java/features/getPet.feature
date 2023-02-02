Feature: Web Services Challenge

  Scenario Outline: Realizar un GET /v2/pet/{petId} para obtener una mascota existente.
    Given I perform GET for the petID <petID>
    Then response is status code <statusCode>
    And validate get schema of response

    Examples:
      | petID | statusCode |
      | "5"   | 200      |





