---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy method"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Font für C++"
description: "Wie man die LINQ_OrderBy-Methode der System::Collections::Generic::IEnumerable-Klasse in C++ verwendet."
type: docs
weight: 2300
url: /de/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


Sortiert die Elemente einer Sequenz in aufsteigender Reihenfolge nach den vom keySelector ausgewählten Schlüsselwerten.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| Parameter | Beschreibung |
| --- | --- |
| keySelector | Eine Funktion, um einen Schlüssel aus einem Element zu extrahieren. |

### ReturnValue

Ein IOrderedEnumerable, dessen Elemente nach einem Schlüssel sortiert sind

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
