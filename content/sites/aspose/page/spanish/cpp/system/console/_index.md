---
title: "Clase System::Console"
linktitle: "Console"
second_title: "Aspose.Page para C++"
description: "Clase System::Console. Proporciona métodos para enviar datos al flujo de salida estándar. Este es un tipo estático sin servicios de instancia. Nunca debe crear instancias de él por ningún medio en C++."
type: docs
weight: 1400
url: /es/cpp/system/console/
---
## Console class


Proporciona métodos para enviar datos al flujo de salida estándar. Este es un tipo estático sin servicios de instancia. Nunca debe crear instancias de él por ningún medio.

```cpp
class Console
```

## Métodos

| Método | Descripción |
| --- | --- |
| static [Beep](./beep/)() | NO IMPLEMENTADO. |
| static [get_Error](./get_error/)() | Devuelve un puntero compartido que apunta al objeto que representa el flujo de error estándar. |
| static [get_In](./get_in/)() | Devuelve un puntero compartido que apunta al objeto que representa el flujo de entrada estándar. |
| static [get_Out](./get_out/)() | Devuelve un puntero compartido que apunta al objeto que representa el flujo de salida estándar. |
| static [Mute](./mute/)(bool) | Silencia o reactiva el flujo de salida estándar. |
| static [ReadKey](./readkey/)() | NO IMPLEMENTADO. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Asigna el objeto especificado a la propiedad Error de la clase. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Establece la propiedad In al objeto TextReader especificado. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Asigna el objeto especificado a la propiedad Out de la clase. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Envía la representación en cadena del objeto especificado al flujo de salida estándar. |
| static [Write](./write/)(bool) | Envía la representación en cadena del valor bool al flujo de salida estándar. |
| static [Write](./write/)(char_t) | Envía el valor de carácter especificado al flujo de salida estándar. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Envía la representación en cadena del arreglo de caracteres especificado al flujo de salida estándar. |
| static [Write](./write/)(const Decimal\&) | Envía la representación en cadena del valor [Decimal](../decimal/) al flujo de salida estándar. |
| static [Write](./write/)(double) | Envía la representación en cadena del valor de punto flotante de doble precisión al flujo de salida estándar. |
| static [Write](./write/)(float) | Envía la representación en cadena del valor de punto flotante de precisión simple al flujo de salida estándar. |
| static [Write](./write/)(int32_t) | Muestra la representación en cadena del valor entero de 32 bits en el flujo de salida estándar. |
| static [Write](./write/)(int64_t) | Muestra la representación en cadena del valor entero de 64 bits en el flujo de salida estándar. |
| static [Write](./write/)(const String\&) | Muestra el objeto cadena especificado en el flujo de salida estándar. |
| static [Write](./write/)(const char_t *) | Muestra la c‑cadena especificada en el flujo de salida estándar. |
| static [Write](./write/)(const TypeInfo\&) | Muestra la representación en cadena del valor [TypeInfo](../typeinfo/) en el flujo de salida estándar. |
| static [Write](./write/)(uint32_t) | Muestra la representación en cadena del valor entero sin signo de 32 bits en el flujo de salida estándar. |
| static [Write](./write/)(uint64_t) | Muestra la representación en cadena del valor entero sin signo de 64 bits en el flujo de salida estándar. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Muestra la representación en cadena del rango especificado del arreglo de caracteres especificado en el flujo de salida estándar. |
| static [Write](./write/)(const String\&, Args\&&...) | Muestra la representación en cadena de los argumentos especificados formateados según el formato especificado en el flujo de salida estándar. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Muestra el terminador de línea actual en el flujo de salida estándar. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Muestra la representación en cadena del objeto especificado seguido del terminador de línea actual en el flujo de salida estándar. |
| static [WriteLine](./writeline/)(bool) | Muestra la representación en cadena del valor bool seguido del terminador de línea actual en el flujo de salida estándar. |
| static [WriteLine](./writeline/)(char_t) | Muestra el valor de carácter especificado seguido del terminador de línea actual en el flujo de salida estándar. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Genera la representación en cadena del arreglo de caracteres especificado, seguido del terminador de línea actual, al flujo de salida estándar. |
| static [WriteLine](./writeline/)(const Decimal\&) | Genera la representación en cadena del valor [Decimal](../decimal/), seguido del terminador de línea actual, al flujo de salida estándar. |
| static [WriteLine](./writeline/)(double) | Genera la representación en cadena del valor de punto flotante de doble precisión, seguido del terminador de línea actual, al flujo de salida estándar. |
| static [WriteLine](./writeline/)(float) | Genera la representación en cadena del valor de punto flotante de precisión simple, seguido del terminador de línea actual, al flujo de salida estándar. |
| static [WriteLine](./writeline/)(int32_t) | Genera la representación en cadena del valor entero de 32 bits, seguido del terminador de línea actual, al flujo de salida estándar. |
| static [WriteLine](./writeline/)(int64_t) | Genera la representación en cadena del valor entero de 64 bits, seguido del terminador de línea actual, al flujo de salida estándar. |
| static [WriteLine](./writeline/)(const String\&) | Escribe el objeto de cadena especificado seguido del terminador de línea actual al flujo de salida estándar. |
| static [WriteLine](./writeline/)(const char_t *) | Escribe la c-string especificada seguida del terminador de línea actual al flujo de salida estándar. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Escribe la representación en cadena del valor [TypeInfo](../typeinfo/) seguido del terminador de línea actual al flujo de salida estándar. |
| static [WriteLine](./writeline/)(uint32_t) | Escribe la representación en cadena del valor entero sin signo de 32 bits seguido del terminador de línea actual al flujo de salida estándar. |
| static [WriteLine](./writeline/)(uint64_t) | Escribe la representación en cadena del valor entero sin signo de 64 bits seguido del terminador de línea actual al flujo de salida estándar. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Escribe la representación en cadena del rango especificado del arreglo de caracteres especificado seguido del terminador de línea actual al flujo de salida estándar. |
| static [WriteLine](./writeline/)(const Exception\&) | Muestra la representación en cadena del objeto [Exception](../exception/) especificado seguido del terminador de línea actual en el flujo de salida estándar. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Muestra la representación en cadena de los argumentos especificados formateados según el formato especificado, seguido del terminador de línea actual en el flujo de salida estándar. |
| static [WriteLine](./writeline/)(const char *) |  |
## Observaciones



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Imprime el mensaje de saludo.
  Console::WriteLine(u"Hello, world!");

  // Crea una instancia de la clase 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Imprime los elementos del arreglo.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
