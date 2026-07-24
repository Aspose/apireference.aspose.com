---
title: "System::Array::TrueForAll yöntemi"
linktitle: "TrueForAll"
second_title: "Aspose.Page için C++"
description: "System::Array::TrueForAll yöntemi. Belirtilen dizideki tüm öğelerin C++'ta belirtilen koşulu sağlayıp sağlamadığını belirler."
type: docs
weight: 5900
url: /tr/cpp/system/array/trueforall/
---
## Array::TrueForAll method


Belirtilen dizideki tüm öğelerin, belirtilen koşulu tanımlayan önermeyi karşılayıp karşılamadığını belirler.

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Koşullara karşı eşleşecek [Array](../) öğeleri |
| eşleşme | System::Predicate\<T\> | Dizi öğelerinin eşleşmesi için koşulları tanımlayan bir predicate |

### ReturnValue

tüm dizi öğeleri predicate match tarafından tanımlanan koşulları sağlarsa true, aksi takdirde false

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
