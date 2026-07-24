---
title: "System::IComparable class"
linktitle: "IComparable"
second_title: "Aspose.Page para C++"
description: "System::IComparable class. Define un método que compara dos objetos. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3300
url: /es/cpp/system/icomparable/
---
## IComparable class


Define un método que compara dos objetos. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de los objetos con los que se compara el objeto actual |
## Métodos

| Método | Descripción |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Compara el objeto actual con el objeto especificado. |

## Ver también

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
