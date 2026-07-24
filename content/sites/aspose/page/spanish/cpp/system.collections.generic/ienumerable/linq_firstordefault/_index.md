---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault método"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Page para C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault método. Devuelve el primer elemento de una secuencia, o un valor predeterminado si la secuencia está vacía en C++."
type: docs
weight: 1600
url: /es/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


Devuelve el primer elemento de una secuencia, o un valor predeterminado si la secuencia está vacía.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

Primer elemento de la secuencia o valor construido por defecto si la secuencia está vacía.

## Ver también

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


Devuelve el primer elemento de la secuencia que cumple una condición o un valor predeterminado si no se encuentra tal elemento.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| predicado | std::function\<bool(T)> | Una función para probar cada elemento con una condición. |

### ReturnValue

default(T) si la fuente está vacía o si ningún elemento supera la prueba especificada por el predicado; de lo contrario, el primer elemento en la fuente que supera la prueba especificada por el predicado.

## Ver también

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
