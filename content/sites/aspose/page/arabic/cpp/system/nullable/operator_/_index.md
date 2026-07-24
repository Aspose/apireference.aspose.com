---
title: "System::Nullable::operator< method"
linktitle: "المشغل <"
second_title: "Aspose.Page لـ C++"
description: "System::Nullable::operator< method. يحدد ما إذا كانت القيمة التي تمثلها الكائن الحالي أصغر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator<() على هذه القيم في C++."
type: docs
weight: 1600
url: /ar/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي تمثلها الكائن الحالي أصغر من القيمة التي يمثلها الكائن [Nullable](../) المحدد عن طريق تطبيق [operator<()](./) على هذه القيم.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي تمثلها الكائن الحالي أصغر من القيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - false

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


يحدد ما إذا كانت القيمة التي تمثلها الكائن الحالي أصغر من القيمة المحددة عن طريق تطبيق [operator<()](./) على هذه القيم.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي تمثلها الكائن الحالي أصغر من القيمة المحددة، وإلا - false

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


دائمًا ما تُعيد false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
العنوان: System::Nullable::operator> method
عنوان الارتباط: operator>
العنوان_الثاني: Aspose.Page for C++
الوصف: 'System::Nullable::operator> method. يحدد ما إذا كانت القيمة التي تمثلها الكائن الحالي أكبر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator>() على هذه القيم في C++.'
النوع: docs
الوزن: 2000
الرابط: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي تمثلها الكائن الحالي أكبر من القيمة التي يمثلها الكائن [Nullable](../) المحدد عن طريق تطبيق [operator>()](./) على هذه القيم.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي تمثلها الكائن الحالي أكبر من القيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - false

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


يحدد ما إذا كانت القيمة التي تمثلها الكائن الحالي أكبر من القيمة المحددة عن طريق تطبيق [operator>()](./) على هذه القيم.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة المحددة، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


دائمًا ما تُعيد false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
