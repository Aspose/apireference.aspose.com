---
title: "System::Nullable::operator&= yöntemi"
linktitle: "operator&="
second_title: "Aspose.Page için C++"
description: "System::Nullable::operator&= yöntemi. Belirtilen değeri sağ taraf argümanı olarak kullanarak, mevcut nesne tarafından temsil edilen değere C++'da operator&=() uygular."
type: docs
weight: 1100
url: /tr/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


Belirtilen değeri sağ taraf argümanı olarak kullanarak, mevcut nesne tarafından temsil edilen değere [operator&=()](./) uygular.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | SFINAE'in çalışmasını sağlamak için şablon parametresi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | bool | Mevcut nesne tarafından temsil edilen değere uygulanan [operator&=()](./) için sağ taraf değeri olarak kullanılan bir boolean değer. |

### ReturnValue

Kendisine bir referans.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
