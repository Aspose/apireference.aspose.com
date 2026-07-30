---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy metodu"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Font için C++"
description: "C++'da System::Linq::IOrderedEnumerable sınıfının LINQ_ThenBy metodunu nasıl kullanılır?"
type: docs
weight: 300
url: /tr/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


Bir anahtara göre dizideki öğeleri artan sırada sonraki bir sıralama gerçekleştirir.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Parametre | Açıklama |
| --- | --- |
| Anahtar | keySelector tarafından döndürülen anahtarın tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | Her öğeden bir anahtar çıkarmak için bir işlev. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
