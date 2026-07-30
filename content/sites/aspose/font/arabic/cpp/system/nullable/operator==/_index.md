---
title: "System::Nullable::operator== method"
linktitle: "operator=="
second_title: "Aspose.Font لـ C++"
description: "System::Nullable::operator== method. يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن Nullable المحدد في C++."
type: docs
weight: 1900
url: /ar/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد.

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(const T1\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة المحددة.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة المحددة، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي فارغة.

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي فارغة (null)، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
