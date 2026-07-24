---
title: "طريقة System::Nullable::operator!="
linktitle: "operator!="
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Nullable::operator!=. تحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي غير مساوية للقيمة الممثلة بواسطة كائن Nullable المحدد في C++."
type: docs
weight: 1000
url: /ar/cpp/system/nullable/operator!=/
---
## Nullable::operator!=(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي غير مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد.

```cpp
template<typename T1> bool System::Nullable<T>::operator!=(const Nullable<T1> &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي غير مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(const T1\&) const method


يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي غير مساوية للقيمة المحددة.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator!=(const T1 &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي غير مساوية للقيمة المحددة، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(std::nullptr_t) const method


يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي غير فارغة.

```cpp
bool System::Nullable<T>::operator!=(std::nullptr_t) const
```


### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي ليست فارغة (null)، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
