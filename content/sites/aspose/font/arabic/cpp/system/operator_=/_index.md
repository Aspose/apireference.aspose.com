---
title: "طريقة System::operator<="
linktitle: "operator<="
second_title: "Aspose.Font لـ C++"
description: "طريقة System::operator<=. تحدد ما إذا كانت القيمة المحددة أصغر أو مساوية للقيمة التي يمثلها الكائن Nullable المحدد عن طريق تطبيق operator<=() على هذه القيم في C++."
type: docs
weight: 32000
url: /ar/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


تحدد ما إذا كانت القيمة المحددة أصغر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../nullable/) المحدد عن طريق تطبيق [operator<=()](./) على هذه القيم.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة المقارنة الأولى |
| T2 | النوع الأساسي لكائن [Nullable](../nullable/) الذي يمثل القيمة المقارنة الثانية |

| معامل | نوع | الوصف |
| --- | --- | --- |
| بعض | const T1\& | إشارة ثابتة إلى القيمة التي ستُستخدم كالمقارنة الأولى |
| other | const Nullable\<T2\>\& | إشارة ثابتة إلى كائن [Nullable](../nullable/) التي تُستخدم قيمته الممثلة كالمقارنة الثانية |

### ReturnValue

صحيح إذا كان المقارن الأول أصغر أو مساوي للمقارن الثاني، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


دائمًا تُعيد false.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
العنوان: طريقة System::operator>=
عنوان_الرابط: operator>=
العنوان_الثاني: Aspose.Font for C++
description: 'طريقة System::operator>=. تحدد ما إذا كانت القيمة المحددة أكبر أو مساوية للقيمة التي يمثلها الكائن Nullable المحدد عن طريق تطبيق operator>=() على هذه القيم في C++.'
النوع: docs
الوزن: 34700
الرابط: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


تحدد ما إذا كانت القيمة المحددة أكبر أو مساوية للقيمة التي يمثلها الكائن [Nullable](../nullable/) المحدد عن طريق تطبيق [operator>=()](./) على هذه القيم.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة المقارنة الأولى |
| T2 | النوع الأساسي لكائن [Nullable](../nullable/) الذي يمثل القيمة المقارنة الثانية |

| معامل | نوع | الوصف |
| --- | --- | --- |
| بعض | const T1\& | إشارة ثابتة إلى القيمة التي ستُستخدم كالمقارنة الأولى |
| other | const Nullable\<T2\>\& | إشارة ثابتة إلى كائن [Nullable](../nullable/) التي تُستخدم قيمته الممثلة كالمقارنة الثانية |

### ReturnValue

صحيح إذا كان المقارن الأول أكبر أو مساوي للمقارن الثاني، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


دائمًا تُعيد false.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
