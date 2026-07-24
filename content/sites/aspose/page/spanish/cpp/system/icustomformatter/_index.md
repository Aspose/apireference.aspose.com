---
title: "Clase System::ICustomFormatter"
linktitle: "ICustomFormatter"
second_title: "Aspose.Page para C++"
description: "Clase System::ICustomFormatter. Define un método que realiza un formato personalizado de la representación en cadena de un valor representado por el objeto especificado. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3500
url: /es/cpp/system/icustomformatter/
---
## ICustomFormatter class


Define un método que realiza un formato personalizado de la representación en cadena de un valor representado por el objeto especificado. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Devuelve una representación en cadena de un valor representado por el objeto actual usando el formato especificado. |
## Ver también

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
