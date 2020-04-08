# new feature
# Tags: optional

Feature: Registrase

  Background:
    Given Que estoy en la pagina "https://www.advantageonlineshopping.com/#/"

    #para la ejecucion de crear cuenta los datos no existen, si ya esta registrado el usuario deben de cambiar la informacion#
  @nuevo
  Scenario: Crear nueva cuenta
    And Doy clic a la opcion de usuario
    And Doy clic en la opcion crear cuenta
    And Ingreso nombre de usuario "pruebas1"
    And Ingreso email "pruebas4@gmail.com"
    And Ingreso contrasena "Pruebas123*"
    And Confirmo contrasena "Pruebas123*"
    And Ingreso nombre "Andrés"
    And Ingreso apellido "Zapata"
    And Ingreso numero telefono "2356522"
    And Ingreso pais "Colombia"
    And Ingreso ciudad "Medellín"
    And Ingreso direccion "Cra. 102c # 23 d 23"
    And Ingreso departamento "Antioquia"
    And Ingreso codigo postal "57"
    And Deschequeo la opcion de ofertas y promociones
    And Chequeo la opcion de acepto las condiciones de uso y el aviso de privacidad
    When Doy clic sobre la opcion REGISTRARSE
    Then Se debe de visualizar el nombre del usuario logueado "pruebas1"

    #al ejecutar se debe de tener en cuenta el lenjuaje en el cual se muestra la alerta de ya existe usuairo#
  @existente
  Scenario: Usuario ya existe
    And Doy clic a la opcion de usuario
    And Doy clic en la opcion crear cuenta
    And Ingreso nombre de usuario "pruebas123"
    And Ingreso email "pruebas@gmail.com"
    And Ingreso contrasena "Pruebas123*"
    And Confirmo contrasena "Pruebas123*"
    And Ingreso nombre "Andrés"
    And Ingreso apellido "Zapata"
    And Ingreso numero telefono "2356522"
    And Ingreso pais "Colombia"
    And Ingreso ciudad "Medellín"
    And Ingreso direccion "Cra. 102c # 23 d 23"
    And Ingreso departamento "Antioquia"
    And Ingreso codigo postal "57"
    And Deschequeo la opcion de ofertas y promociones
    And Chequeo la opcion de acepto las condiciones de uso y el aviso de privacidad
    When Doy clic sobre la opcion REGISTRARSE
    Then El sistema debe de mostrar un mensaje indicando que el "User name already exists"
