---
title: "Clase System::Linq::IOrderedEnumerable"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Page para C++"
description: "Clase System::Linq::IOrderedEnumerable. Representa una secuencia ordenada en C++."
type: docs
weight: 300
url: /es/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Representa una secuencia ordenada.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de los elementos de la secuencia. |
## Métodos

| Método | Descripción |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Obtiene el enumerador. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Realiza un ordenamiento posterior de los elementos en una secuencia en orden ascendente según una clave. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Comparator](./comparator/) | Información RTTI. |

## Ver también

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Page for C++](../../)
