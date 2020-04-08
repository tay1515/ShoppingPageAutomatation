# new feature
# Tags: optional

Feature: Iniciar sesion

  Background:
    Given Ingreso a la pagina "https://www.advantageonlineshopping.com/#/"

  @login
  Scenario: Inicio de sesion
    And Doy clic a la opcion de perfil usuario
    And Digito nombre de usuario "pruebas123"
    And Digito contrasena "Pruebas123*"
    When Doy clic sobre en la opcion REGISTRARSE
    Then Debo de visualizar mi nombre de usuario en la parte derecha "pruebas123"

  @CarritoCompras
  Scenario: Inicio de sesion
    And Doy clic a la opcion de perfil usuario
    And Digito nombre de usuario "pruebas123"
    And Digito contrasena "Pruebas123*"
    When Doy clic sobre en la opcion REGISTRARSE
    And Debo de visualizar mi nombre de usuario en la parte derecha "pruebas123"
    And Seleccio no el item altavoces
    And Doy clic en COMPRAR AHORA
    And Selecciono el color
    And Ingreso la cantidad de altavoces

