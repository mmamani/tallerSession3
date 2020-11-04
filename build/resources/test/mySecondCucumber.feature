Feature: Login

  #TAGS ---- test suites
  @Regression @SmokeTest @Priority1 @Login @Eynar
  Scenario Outline: Como usuario comun
  Quiero ingresar mi usuario y mi password para poder loguerame
  Para Que solo usuarios registrador accedan a la aplicacion
    # commentss
    # uso de variables es estre simbolos de mayor y menor <VARIABLE>
    Given yo tengo acceso a la aplicacion FACEBOOK
    When yo lleno el textbox user con : <user>
    And yo lleno el textbox password con : <password>
    And yo realizo click en el boton login
    Then yo espero que la pagina principal sea mostrada

    Examples:
      | user   | password |
      | Eynar1 | 12345    |
      | Eynar2 | 123456   |
      | Eynar3 | 1234567  |
      | Eynar4 | 12345678 |
      | Eynar5 | 12345FFF |

