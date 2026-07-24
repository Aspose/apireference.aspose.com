---
title: "Clase System::IO::StringReader"
linktitle: "StringReader"
second_title: "Aspose.Page para C++"
description: "Clase System::IO::StringReader. Representa un lector que lee caracteres de una cadena. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2400
url: /es/cpp/system.io/stringreader/
---
## StringReader class


Representa un lector que lee caracteres de una cadena. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class StringReader : public System::IO::TextReader
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Close](./close/)() override | Cierra el flujo. |
| [Dispose](./dispose/)() override | No hace nada. |
| [Dispose](./dispose/)(bool) override | No hace nada. |
| [Peek](./peek/)() override | Lee un solo carácter del flujo sin cambiar la posición del flujo. |
| [Read](./read/)() override | Lee un solo carácter del flujo. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Lee la cantidad especificada de caracteres del flujo al arreglo de caracteres especificado, comenzando en la posición especificada. |
| [ReadLine](./readline/)() override | Lee caracteres del flujo hasta el final de la línea actual. |
| [ReadToEnd](./readtoend/)() override | Lee caracteres del flujo hasta el final del flujo. |
| [StringReader](./stringreader/)(const String\&) | Construye una nueva instancia de la clase [StringReader](./) que lee caracteres de la cadena especificada. |
## Ver también

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
