---
title: "طريقة System::Nullable::operator&="
linktitle: "operator&="
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Nullable::operator&=. يطبق operator&=() على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة المحددة كمعامل جانبي أيمن في C++."
type: docs
weight: 1100
url: /ar/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


يطبق [operator&=()](./) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة المحددة كمعامل جانبي أيمن.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | معامل القالب لجعل SFINAE يعمل. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | bool | قيمة منطقية تُستخدم كقيمة جانبية أيمن لـ [operator&=()](./) المطبقة على القيمة الممثلة بواسطة الكائن الحالي. |

### ReturnValue

مرجع إلى الذات.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
