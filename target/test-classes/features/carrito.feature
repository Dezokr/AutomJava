#language:es

  Característica: Funcionalidad del carrito de compra

    Escenario: Compra de un producto
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "5"
      Y realiza la compra

    Esquema del escenario: : Compra de un producto con varias cantidades
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "<cant>"
      Y realiza la compra
      Ejemplos: Tabla de cantidades
        | cant |
        |4  |
        |6  |