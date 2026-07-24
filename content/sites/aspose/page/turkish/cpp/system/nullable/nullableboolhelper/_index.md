---
title: "System::Nullable::NullableBoolHelper metodu"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Page için C++"
description: "System::Nullable::NullableBoolHelper metodu. **this** ve **other**'ın ikisinin de null olmadığını kontrol eden ve öyleyse bir lambda çağıran yardımcı işlev. C++'ta implementation.s içinde kullanılır."
type: docs
weight: 800
url: /tr/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Bu ve **other** öğelerinin ikisinin de null olmadığını kontrol eden yardımcı işlev ve eğer öyleyse bir lambda çağırır. Uygulamalarda kullanılır.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Diğer nullable tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırma için diğer nullable değer. |
| f | const std::function\<bool()>\& | Her iki **this** ve **other** null olmadığında çağrılacak lambda. |
| default_if_both_are_null | bool | Her iki değer de null ise döndürülecek değer. |

### ReturnValue

Eğer **this** ya da **other** null ise false; **default_if_both_are_null** her iki değer de null ise; **f** çağrısının sonucu her iki değer de null değilse.

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
