---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending Methode"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Font für C++"
description: "Wie man die LINQ_OrderByDescending Methode der Klasse System::Collections::Generic::IEnumerable in C++ verwendet."
type: docs
weight: 2400
url: /de/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Sortiert die Elemente einer Sequenz in absteigender Reihenfolge nach den vom keySelector ausgewählten Schlüsselwerten.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parameter | Beschreibung |
| --- | --- |
| keySelector | Eine Funktion, um einen Schlüssel aus einem Element zu extrahieren. |

### ReturnValue

Ein IOrderedEnumerable, dessen Elemente nach dem Schlüssel in absteigender Reihenfolge sortiert sind.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
