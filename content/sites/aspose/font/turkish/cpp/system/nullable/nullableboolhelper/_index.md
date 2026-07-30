---
title: "System::Nullable::NullableBoolHelper yöntemi"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Font için C++"
description: "System::Nullable::NullableBoolHelper yöntemi. Bu ve diğer nesnelerin ikisinin de null olmamasını kontrol eden ve böyleyse bir lambda çağıran yardımcı işlev. C++'ta implementasyonlarda kullanılır."
type: docs
weight: 800
url: /tr/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


**other** ile bunun her ikisinin de null olmamasını kontrol eden ve bu durumda bir lambda çağıran yardımcı işlev. Uygulamalarda kullanılır.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Diğer nullable tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırma için diğer nullable değer. |
| f | const std::function\<bool()>\& | Her iki **this** ve **other** null değilse çağırılacak lambda. |
| default_if_both_are_null | bool | Her iki değer de null ise döndürülecek değer. |

### ReturnValue

**this** veya **other** null ise false; her ikisi de null ise **default_if_both_are_null**; ikisi de null değilse **f** çağrısının sonucu.

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
