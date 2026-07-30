---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "Aspose.Font için C++"
description: "System::Array::FindAll method. Belirtilen koşulu sağlayan tüm öğeleri C++'da getirir."
type: docs
weight: 5200
url: /tr/cpp/system/array/findall/
---
## Array::FindAll method


Belirtilen koşul tarafından tanımlanan şartları karşılayan tüm öğeleri alır.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) içinde öğeleri aramak için |
| eşleşme | System::Predicate\<T\> | Dizi öğelerinin eşleşmesi için koşulları tanımlayan bir predicate |

### ReturnValue

Belirtilen koşulu sağlayan tüm öğeleri içeren bir [Array](../) (bulunursa); aksi takdirde boş bir [Array](../).

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
