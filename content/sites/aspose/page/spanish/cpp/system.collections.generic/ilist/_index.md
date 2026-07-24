---
title: "System::Collections::Generic::IList clase"
linktitle: "IList"
second_title: "Aspose.Page para C++"
description: "System::Collections::Generic::IList clase. Interfaz de contenedor indexado de elementos. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2600
url: /es/cpp/system.collections.generic/ilist/
---
## IList class


Interfaz de contenedor indexado de elementos. Los objetos de esta clase solo deben ser asignados usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de elemento. |
## Métodos

| Método | Descripción |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Comprueba si la colección tiene tamaño fijo. |
| virtual [idx_get](./idx_get/)(int) const | Obtiene el elemento en el índice especificado. |
| virtual [idx_set](./idx_set/)(int, T) | Establece el elemento en el índice especificado. |
| virtual [IndexOf](./indexof/)(const T\&) const | Obtiene el índice de la primera aparición del elemento en el contenedor. |
| virtual [Insert](./insert/)(int, const T\&) | Inserta un elemento en la posición especificada, desplazando los demás elementos. |
| virtual [RemoveAt](./removeat/)(int) | Elimina el elemento en el índice especificado. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [BaseType](./basetype/) | Información RTTI. |
| [ThisType](./thistype/) | Este tipo. |
| [ValueType](./valuetype/) | Tipo de valor. |

## Ver también

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
