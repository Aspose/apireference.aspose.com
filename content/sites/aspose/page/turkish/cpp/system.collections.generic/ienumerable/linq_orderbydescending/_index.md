---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending yöntemi"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Page için C++"
description: "C++'da System::Collections::Generic::IEnumerable sınıfının LINQ_OrderByDescending yöntemini nasıl kullanılır?"
type: docs
weight: 2400
url: /tr/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Dizinin elemanlarını keySelector tarafından seçilen anahtar değerlerine göre azalan sırada sıralar.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parameter | Açıklama |
| --- | --- |
| keySelector | Bir öğeden anahtar çıkarmak için bir işlev. |

### ReturnValue

Anahtarın azalan sırasına göre sıralanmış öğelere sahip bir IOrderedEnumerable.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
