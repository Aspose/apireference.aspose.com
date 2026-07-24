---
title: "System::Nullable::Equals طريقة"
linktitle: "يساوي"
second_title: "Aspose.Page لـ C++"
description: "System::Nullable::Equals طريقة. يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها كائن Nullable المحدد في C++."
type: docs
weight: 200
url: /ar/cpp/system/nullable/equals/
---
## Nullable::Equals method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const T1\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
