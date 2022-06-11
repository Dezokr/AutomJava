#language:es

  Característica: Funcionalidad del carrito de compra

    Escenario: Compra de un producto
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "5"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto

    Esquema del escenario: : Compra de un producto con varias cantidades
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "<cant>"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto
      Ejemplos: Tabla de cantidades
        | cant |
        |4  |
        |6  |