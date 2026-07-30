---
title: "System::Array::Exists yöntemi"
linktitle: "Exists"
second_title: "Aspose.Font için C++"
description: "System::Array::Exists yöntemi. Belirtilen Array nesnesinin, belirtilen koşulu sağlayan bir eleman içerip içermediğini C++'ta belirler."
type: docs
weight: 5000
url: /tr/cpp/system/array/exists/
---
## Array::Exists method


Belirtilen [Array](../) nesnesinin, belirtilen koşulu sağlayan bir eleman içerip içermediğini belirler.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Elemanın aranacağı dizi |
| eşleşme | std::function\<bool(T)> | Gereksinimleri tanımlayan ve bir elemanın bunları sağlayıp sağlamadığını kontrol eden fonksiyon nesnesi |

### ReturnValue

**arr** belirtilen **match** gereksinimlerini sağlayan bir eleman içeriyorsa doğru

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
