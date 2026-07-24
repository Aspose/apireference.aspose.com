---
title: "طريقة System::Nullable::operator<= method"
linktitle: "المشغل <="
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Nullable::operator<= method. تحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر أو مساوية للقيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator<=() على هاتين القيمتين في C++."
type: docs
weight: 1700
url: /ar/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد عن طريق تطبيق [operator<=()](./) على هذه القيم.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أصغر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر أو مساوية للقيمة المحددة عن طريق تطبيق [operator<=()](./) على هذه القيم.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أصغر أو مساوية للقيمة المحددة، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


دائمًا ما تُعيد false.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
العنوان: System::Nullable::operator>= method
عنوان الرابط: operator>=
العنوان_الثاني: Aspose.Page for C++
الوصف: 'System::Nullable::operator>= method. يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن Nullable المحدد عن طريق تطبيق operator>=() على هذه القيم في C++.'
النوع: docs
الوزن: 2100
الرابط: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد عن طريق تطبيق [operator>=()](./) على هذه القيم.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| Parameter | Type | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن المحدد عن طريق تطبيق [operator>=()](./) على هاتين القيمتين.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | النوع الأساسي للقيمة التي تُقارن بها القيمة التي يمثلها الكائن الحالي |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | const T1\& | مرجع ثابت إلى كائن للمقارنة مع الكائن الحالي |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


دائمًا ما تُعيد false.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

دائمًا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
العنوان: طريقة System::Nullable::operator|= 
عنوان الرابط: operator|=
العنوان_الثاني: Aspose.Page for C++
description: 'طريقة System::Nullable::operator|= . يطبق operator|=() على القيمة التي يمثلها الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن في C++.'
النوع: docs
الوزن: 2200
الرابط: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


يطبق [operator|=()](./) على القيمة التي يمثلها الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | معامل القالب لجعل SFINAE يعمل. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | bool | قيمة منطقية تُستخدم كقيمة على الجانب الأيمن للـ [operator | =()](./) المطبقة على القيمة التي يمثلها الكائن الحالي. |

### ReturnValue

مرجع إلى الذات.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
