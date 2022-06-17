#language:es

  Característica: Funcionalidad del carrito de compra version 2
  @smoke
    Escenario: Compra de un producto version 2
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "5"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto
      Entonces validar mensaje de pago "Payment successfull!"
  @regresion
    Esquema del escenario: : Compra de un producto con varias cantidades version 2
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "<cant>"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto
      Entonces validar mensaje de pago "<msg>"
      Ejemplos: Tabla de cantidades
        | cant  |msg|
        |1      |Payment successfull!|
        |3      |Payment Failed!     |