---
title: "System::Nullable::operator&= yöntemi"
linktitle: "operator&="
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator&= yöntemi. Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere operator&=() uygular C++'da."
type: docs
weight: 1100
url: /tr/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator&=()](./) uygular.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | SFINAE'nin çalışması için şablon parametresi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | bool | Geçerli nesne tarafından temsil edilen değere uygulanan [operator&=()](./) için sağ taraf değeri olarak kullanılan bir boolean değer. |

### ReturnValue

Kendisine bir referans.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
