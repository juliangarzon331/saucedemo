#language=es
Feature: Iniciar sesion en una aplicacion
  Como usuario
  Quiero iniciar sesion en la aplicacion
  Para acceder a mi cuenta

  Scenario: Iniciar sesion con credenciales validas
    Given que estoy en la pagina de inicio de sesion
    When ingreso mi nombre de usuario "standard_user" y mi contrasena "secret_sauce"
    And selecciono el producto con el nombre "Sauce Labs Backpack"
    Then debo ver el nombre del producto "Sauce Labs Backpack"

  Scenario: Ordenar productos por precio ascendente
    Given que estoy en la pagina de inicio de sesion
    When ingreso mi nombre de usuario "standard_user" y mi contrasena "secret_sauce"
    And ordeno la lista de productos por precio ascendente "Price (low to high)"
    Then valido que la lista de productos se ordeno exitosamente

