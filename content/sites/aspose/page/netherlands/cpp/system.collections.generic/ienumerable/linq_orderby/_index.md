---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy methode"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de LINQ_OrderBy methode van de System::Collections::Generic::IEnumerable klasse in C++."
type: docs
weight: 2300
url: /nl/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


Sorteert de elementen van een reeks in oplopende volgorde op basis van de sleutelwaarden geselecteerd door keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| Parameter | Beschrijving |
| --- | --- |
| keySelector | Een functie om een sleutel uit een element te extraheren. |

### ReturnValue

Een IOrderedEnumerable waarvan de elementen gesorteerd zijn volgens een sleutel

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
