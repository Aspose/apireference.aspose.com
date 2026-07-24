---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending methode"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Page voor C++"
description: "Hoe de LINQ_OrderByDescending-methode van de System::Collections::Generic::IEnumerable-klasse te gebruiken in C++."
type: docs
weight: 2400
url: /nl/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Sorteert de elementen van een reeks in aflopende volgorde op basis van de sleutelwaarden geselecteerd door keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parameter | Beschrijving |
| --- | --- |
| keySelector | Een functie om een sleutel uit een element te extraheren. |

### ReturnValue

Een IOrderedEnumerable waarvan de elementen gesorteerd zijn in aflopende volgorde van de sleutel.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
