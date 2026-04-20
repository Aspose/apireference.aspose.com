---
title: "طريقة System::Nullable::operator<="
linktitle: "operator<="
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Nullable::operator<=. تحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي أصغر أو مساوية للقيمة الممثلة بواسطة كائن Nullable المحدد عن طريق تطبيق operator<=() على هاتين القيمتين في C++."
type: docs
weight: 1700
url: /ar/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


تحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي أصغر أو مساوية للقيمة الممثلة بواسطة الكائن [Nullable](../) المحدد عن طريق تطبيق [operator<=()](./) على هذه القيم.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة الممثلة بواسطة الكائن الحالي أصغر أو مساوية للقيمة الممثلة بواسطة الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(const T1\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أقل أو مساوية للقيمة المحددة عن طريق تطبيق [operator<=()](./) على هذه القيم.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أقل أو مساوية للقيمة المحددة، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


دائمًا تُعيد false.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator>= method
عنوان_الرابط: operator>=
العنوان_الثاني: Aspose.Font for C++
description: 'System::Nullable::operator>= method. يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن Nullable المحدد عن طريق تطبيق operator>=() على هذه القيم في C++.'
النوع: docs
weight: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد عن طريق تطبيق [operator>=()](./) على هذه القيم.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(const T1\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن المحدد عن طريق تطبيق [operator>=()](./) على هذه القيم.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي للقيمة لمقارنة القيمة التي يمثلها الكائن الحالي معها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const T1\& | إشارة ثابتة إلى كائن للمقارنة مع الكائن الحالي |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


دائمًا تُعيد false.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

دائمًا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator|= method
linktitle: operator|=
العنوان_الثاني: Aspose.Font for C++
description: 'System::Nullable::operator|= method. يطبق operator|=() على القيمة التي يمثلها الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن في C++.'
النوع: docs
weight: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


يطبق [operator|=()](./) على القيمة التي يمثلها الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| معامل | الوصف |
| --- | --- |
| T1 | معامل القالب لجعل SFINAE يعمل. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | bool | قيمة منطقية تُستخدم كقيمة على الجانب الأيمن من [operator | =()](./) المطبقة على القيمة التي يمثلها الكائن الحالي. |

### ReturnValue

مرجع إلى الذات.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
