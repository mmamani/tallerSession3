Feature:  Contact Manager

  @ContactManagerSuite
  Scenario: Como user
            Quiero agregar un nuevo contacto
            Para Que lo pueda utilizar cuando lo necesite

    Given yo tengo acceso a la android app de ContactManager
    When yo hago click en el boton de OK en dialog de Update
    And  yo hago click en el boton de Add Contact en la pantalla principal
    And yo lleno el textbox Name Contact con el valor : REMOVE
    And yo lleno el textbox Phone Contact con el valor : 777777
    And yo lleno el textbox Email Contact con el valor : remove@remove.com
    And yo hago click en el boton de Save
    #Then el nuevo contacto REMOVE es mostrado



