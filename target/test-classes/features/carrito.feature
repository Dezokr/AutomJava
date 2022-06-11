#language:es

  Característica: Funcionalidad del carrito de compra

    Escenario: Compra de un producto
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "5"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto
      Entonces validar mensaje de pago "Payment successfull!"

    Esquema del escenario: : Compra de un producto con varias cantidades
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "<cant>"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto
      Entonces validar mensaje de pago "<msg>"
      Ejemplos: Tabla de cantidades
        | cant  |msg|
        |4      |Payment successfull!|
        |6      |Payment Failed!     |