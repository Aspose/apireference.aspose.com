---
title: "System::Nullable::operator< method"
linktitle: "operator<"
second_title: "Aspose.Font لـ C++"
description: "System::Nullable::operator< method. يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator<() على هاتين القيمتين في C++."
type: docs
weight: 1600
url: /ar/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من القيمة التي يمثلها كائن [Nullable](../) المحدد عن طريق تطبيق [operator<()](./) على هاتين القيمتين.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من القيمة التي يمثلها كائن [Nullable](../) المحدد، وإلا - false

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(const T1\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من القيمة المحددة عن طريق تطبيق [operator<()](./) على هاتين القيمتين.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من القيمة المحددة، وإلا - false

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


دائمًا تُعيد false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
العنوان: System::Nullable::operator> method
عنوان_الرابط: operator>
العنوان_الثاني: Aspose.Font for C++
description: 'System::Nullable::operator> method. يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator>() على هذه القيم في C++.'
النوع: docs
الوزن: 2000
الرابط: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة التي يمثلها الكائن [Nullable](../) المحدد عن طريق تطبيق [operator>()](./) على هذه القيم.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) للمقارنة معه |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) للمقارنة معه |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة التي يمثلها الكائن [Nullable](../) المحدد، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(const T1\&) const method


يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة المحددة عن طريق تطبيق [operator>()](./) على هذه القيم.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة للمقارنة معها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const T1\& | مرجع ثابت إلى القيمة للمقارنة معها |

### ReturnValue

صحيح إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة المحددة، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


دائمًا تُعيد false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## انظر أيضًا

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
