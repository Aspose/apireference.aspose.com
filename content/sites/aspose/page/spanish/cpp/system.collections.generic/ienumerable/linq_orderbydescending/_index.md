---
title: "Método LINQ_OrderByDescending de System::Collections::Generic::IEnumerable"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Page para C++"
description: "Cómo usar el método LINQ_OrderByDescending de la clase System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 2400
url: /es/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Ordena los elementos de una secuencia en orden descendente según los valores clave seleccionados por keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parámetro | Descripción |
| --- | --- |
| keySelector | Una función para extraer una clave de un elemento. |

### ReturnValue

Un IOrderedEnumerable cuyos elementos están ordenados en orden descendente según la clave.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
