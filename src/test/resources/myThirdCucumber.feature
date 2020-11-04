Feature: Login

  #TAGS ---- test suites
  # Background

  Background:
    Given yo tengo acceso a la aplicacion FACEBOOK


  @Regression @SmokeTest @Priority1 @Login
  Scenario: Como usuario comun
  Quiero ingresar mi usuario y mi password para poder loguerame
  Para Que solo usuarios registrador accedan a la aplicacion
    # commentss
    When yo lleno el textbox user con : Eynar
    And yo lleno el textbox password con : 12345
    And yo realizo click en el boton login
    Then yo espero que la pagina principal sea mostrada


  @Regression @SmokeTest @Priority1 @Login
  Scenario: Como usuario comun
  Quiero ingresar mi usuario y mi password para poder loguerame
  Para Que solo usuarios registrador accedan a la aplicacion
    # commentss
    When yo lleno el textbox user con : Eynar
    And yo lleno el textbox password con : 12345
    And yo realizo click en el boton login
    Then yo espero que la pagina principal sea mostrada

  @Regression @SmokeTest @Priority1 @Login
  Scenario: Como usuario comun
  Quiero ingresar mi usuario y mi password para poder loguerame
  Para Que solo usuarios registrador accedan a la aplicacion
    # commentss
    When yo lleno el textbox user con : Eynar
    And yo lleno el textbox password con : 12345
    And yo realizo click en el boton login
    Then yo espero que la pagina principal sea mostrada

