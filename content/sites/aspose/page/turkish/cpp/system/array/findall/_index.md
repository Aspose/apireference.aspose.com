---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "Aspose.Page için C++"
description: "System::Array::FindAll method. Belirtilen koşula uyan tüm öğeleri C++'da getirir."
type: docs
weight: 5200
url: /tr/cpp/system/array/findall/
---
## Array::FindAll method


Belirtilen koşul tarafından tanımlanan koşullara uyan tüm öğeleri alır.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) içinde öğeleri aramak için |
| eşleşme | System::Predicate\<T\> | Dizi öğelerinin eşleşmesi için koşulları tanımlayan bir predicate |

### ReturnValue

Belirtilen koşula uyan tüm öğeleri içeren bir [Array](../); bulunamazsa, boş bir [Array](../).

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
