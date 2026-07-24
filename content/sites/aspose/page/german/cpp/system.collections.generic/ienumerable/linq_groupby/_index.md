---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy method"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page für C++"
description: "Wie man die LINQ_GroupBy-Methode der System::Collections::Generic::IEnumerable-Klasse in C++ verwendet."
type: docs
weight: 1700
url: /de/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Gruppiert die Elemente einer Sequenz.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parameter | Beschreibung |
| --- | --- |
| Schlüssel | Der Typ des Schlüssels, der von keyPredicate zurückgegeben wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Eine Funktion, um den Schlüssel für jedes Element zu extrahieren. |

### ReturnValue

Ein [IEnumerable](../), das eine Sequenz von Objekten und einen Schlüssel enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
