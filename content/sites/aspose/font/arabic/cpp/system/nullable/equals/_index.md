---
title: "طريقة System::Nullable::Equals"
linktitle: "يساوي"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Nullable::Equals. تحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي مساوية للقيمة الممثلة بواسطة كائن Nullable المحدد في C++."
type: docs
weight: 200
url: /ar/cpp/system/nullable/equals/
---
## Nullable::Equals method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const T1\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
