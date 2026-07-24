---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy yöntemi"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page için C++"
description: "C++'ta System::Collections::Generic::IEnumerable sınıfının LINQ_GroupBy yöntemini nasıl kullanılır."
type: docs
weight: 1700
url: /tr/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Bir dizinin elemanlarını gruplar.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parameter | Açıklama |
| --- | --- |
| Anahtar | keyPredicate tarafından döndürülen anahtarın tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Her öğe için anahtarı çıkarmak amacıyla bir fonksiyon. |

### ReturnValue

Nesnelerden oluşan bir dizi ve bir anahtar içeren bir [IEnumerable](../).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
