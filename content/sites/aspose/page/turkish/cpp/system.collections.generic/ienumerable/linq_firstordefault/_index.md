---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault yöntemi"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault yöntemi. Bir dizinin ilk öğesini döndürür, ya da dizi boşsa varsayılan bir değer döndürür C++'da."
type: docs
weight: 1600
url: /tr/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


Bir dizinin ilk elemanını döndürür; dizi boşsa varsayılan bir değer döndürür.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

Dizideki ilk öğe veya dizi boşsa varsayılan oluşturulmuş değer.

## Ayrıca Bakınız

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


Bir koşulu sağlayan dizinin ilk elemanını döndürür; böyle bir eleman bulunamazsa varsayılan bir değer döndürür.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| koşul | std::function\<bool(T)> | Her öğeyi bir koşul için test eden bir fonksiyon. |

### ReturnValue

kaynak boşsa veya hiçbir öğe koşul tarafından belirtilen testi geçmezse default(T); aksi takdirde, koşul tarafından belirtilen testi geçen kaynaktaki ilk öğe.

## Ayrıca Bakınız

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
