---
title: "Método System::Collections::Generic::IEnumerable::LINQ_GroupBy"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page para C++"
description: "Cómo usar el método LINQ_GroupBy de la clase System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 1700
url: /es/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Agrupa los elementos de una secuencia.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parámetro | Descripción |
| --- | --- |
| Clave | El tipo de la clave devuelta por keyPredicate |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Una función para extraer la clave de cada elemento. |

### ReturnValue

Un [IEnumerable](../) que contiene una secuencia de objetos y una clave

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
