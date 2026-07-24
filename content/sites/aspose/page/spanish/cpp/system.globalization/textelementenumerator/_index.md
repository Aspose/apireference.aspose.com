---
title: "System::Globalization::TextElementEnumerator clase"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Page para C++"
description: "System::Globalization::TextElementEnumerator clase. Enumerador para iterar a través de los elementos de la cadena (caracteres). Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 2700
url: /es/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


Enumerador para iterar a través de los elementos de la cadena (caracteres). Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Current](./get_current/)() const | Obtiene el elemento de texto actual. |
| [get_ElementIndex](./get_elementindex/)() const | Obtiene el índice del elemento de texto actual. |
| [GetTextElement](./gettextelement/)() const | Obtiene el elemento actual. |
| [MoveNext](./movenext/)() | Se mueve al siguiente elemento. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | Establece el enumerador en la posición inicial. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
