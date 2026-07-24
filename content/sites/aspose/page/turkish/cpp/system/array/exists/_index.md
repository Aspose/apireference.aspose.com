---
title: "System::Array::Exists yöntemi"
linktitle: "Exists"
second_title: "Aspose.Page için C++"
description: "System::Array::Exists yöntemi. Belirtilen Array nesnesinin, belirtilen koşulun gereksinimlerini karşılayan bir eleman içerip içermediğini C++'da belirler."
type: docs
weight: 5000
url: /tr/cpp/system/array/exists/
---
## Array::Exists method


Belirtilen [Array](../) nesnesinin, belirtilen koşulun gereksinimlerini karşılayan bir eleman içerip içermediğini belirler.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Elemanın aranacağı dizi |
| eşleşme | std::function\<bool(T)> | Gereksinimleri tanımlayan ve bir elemanın bunları karşılayıp karşılamadığını kontrol eden fonksiyon nesnesi |

### ReturnValue

Eğer **arr** belirtilen **match** tarafından tanımlanan gereksinimleri karşılayan bir eleman içeriyorsa doğru

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
