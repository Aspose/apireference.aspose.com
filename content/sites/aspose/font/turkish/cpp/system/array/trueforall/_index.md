---
title: "System::Array::TrueForAll yöntemi"
linktitle: "TrueForAll"
second_title: "Aspose.Font için C++"
description: "System::Array::TrueForAll yöntemi. Belirtilen dizideki tüm elemanların, belirtilen koşulu sağlayıp sağlamadığını C++'ta belirler."
type: docs
weight: 5900
url: /tr/cpp/system/array/trueforall/
---
## Array::TrueForAll method


Belirtilen dizideki tüm öğelerin, belirtilen koşul tarafından tanımlanan koşulları sağlayıp sağlamadığını belirler.

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Koşullara karşı eşleşecek [Array](../) elemanları |
| eşleşme | System::Predicate\<T\> | Dizi öğelerinin eşleşmesi için koşulları tanımlayan bir predicate |

### ReturnValue

tüm arr dizisi elemanları predicate match tarafından tanımlanan koşulları sağlarsa true, aksi takdirde false

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
