---
title: "طريقة System::Nullable::operator+= "
linktitle: "operator+="
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Nullable::operator+=. يطبق operator+=() على القيمة التي يمثلها الكائن الحالي باستخدام القيمة التي يمثلها الكائن Nullable المحدد كمعامل على الجانب الأيمن في C++."
type: docs
weight: 1300
url: /ar/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


يطبق [operator+=()](./) على القيمة التي يمثلها الكائن الحالي باستخدام القيمة التي يمثلها الكائن [Nullable](../) المحدد كمعامل على الجانب الأيمن.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) الذي تُستخدم قيمته كمعامل على الجانب الأيمن لـ [operator+=()](./) |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) تُستخدم قيمته كمعامل على الجانب الأيمن للـ [operator+=()](./) المطبق على القيمة التي يمثلها الكائن الحالي. |

### ReturnValue

إشارة إلى الذات

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(const T1\&) method


يطبق [operator+=()](./) على القيمة التي يمثلها الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع القيمة المستخدمة كقيمة على الجانب الأيمن لـ [operator+=()](./) |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const T1\& | مرجع ثابت إلى القيمة التي تُستخدم كقيمة على الجانب الأيمن للـ [operator+=()](./) المطبق على القيمة التي يمثلها الكائن الحالي. |

### ReturnValue

إشارة إلى الذات

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


يعيد ضبط الكائن الحالي بحيث يمثل قيمة فارغة.

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

نسخة من الذات

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
