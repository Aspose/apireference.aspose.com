---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy methode"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page voor C++"
description: "Hoe de LINQ_GroupBy methode van de System::Collections::Generic::IEnumerable klasse te gebruiken in C++."
type: docs
weight: 1700
url: /nl/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Groepeert de elementen van een reeks.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parameter | Beschrijving |
| --- | --- |
| Sleutel | Het type van de sleutel dat wordt geretourneerd door keyPredicate |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Een functie om de sleutel voor elk element te extraheren. |

### ReturnValue

Een [IEnumerable](../) die een reeks objecten en een sleutel bevat

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
