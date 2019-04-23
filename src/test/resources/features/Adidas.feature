Feature: Adidas

  Scenario: Home page is displayed
    Given 'Adidas' page is loaded
    When Hover HOMBRE link HEADER
    And Click Futbol link sub menú
    And click on first product
#      And Select talla of "Mx 9.5" dropdown guia de tallas
#      And click on anyadir al carrito
#    Then Verify that Cantidad is "1"
#    When Click on ver carrito
#    Then Validate "nombre tennis" title is displayed
#      And Validate quantity of dropdown is "1"
#      And Validate remove link is displayed
#      And Validate price should be ""
#      And Validate total should be ""