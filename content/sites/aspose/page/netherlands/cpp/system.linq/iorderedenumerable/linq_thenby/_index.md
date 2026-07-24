---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy methode"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Page voor C++"
description: "Hoe de LINQ_ThenBy-methode van de System::Linq::IOrderedEnumerable-klasse in C++ te gebruiken."
type: docs
weight: 300
url: /nl/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


Voert een vervolgordering uit van de elementen in een reeks in oplopende volgorde op basis van een sleutel.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Parameter | Beschrijving |
| --- | --- |
| Sleutel | Het type van de sleutel die door keySelector wordt geretourneerd. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | Een functie om een sleutel uit elk element te extraheren. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
