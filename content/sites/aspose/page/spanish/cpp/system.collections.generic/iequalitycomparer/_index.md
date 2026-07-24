---
title: "System::Collections::Generic::IEqualityComparer clase"
linktitle: "IEqualityComparer"
second_title: "Aspose.Page para C++"
description: "System::Collections::Generic::IEqualityComparer clase. Interfaz que proporciona medios para comparar dos objetos por igualdad. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2400
url: /es/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Interfaz que proporciona medios para comparar dos objetos por igualdad. Los objetos de esta clase solo deben ser asignados usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo que se está comparando. |
## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | Información RTTI. |
| virtual [GetHashCode](./gethashcode/)(T) const | Obtiene el código hash de algún objeto. |

## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
