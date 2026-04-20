---
title: "طريقة System::operator*"
linktitle: "operator*"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::operator* . تُعيد نسخة جديدة من فئة Decimal تمثل قيمة ناتجة عن ضرب القيمة المحددة والقيمة الممثلة بواسطة كائن Decimal المحدد في C++."
type: docs
weight: 27500
url: /ar/cpp/system/operator_/
---
## System::operator* method


تُعيد نسخة جديدة من فئة [Decimal](../decimal/) تمثل قيمة ناتجة عن ضرب القيمة المحددة والقيمة الممثلة بواسطة كائن [Decimal](../decimal/) المحدد.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const T\& | المضاعف الأول |
| d | const Decimal\& | الكائن [Decimal](../decimal/) الذي يمثل المضاعف الثاني |

### ReturnValue

نسخة جديدة من فئة [Decimal](../decimal/) تمثل قيمة ناتجة عن ضرب **x** والقيمة الممثلة بواسطة **d**.

## انظر أيضًا

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
العنوان: طريقة System::operator<
عنوان الرابط: operator<
العنوان_الثاني: Aspose.Font for C++
الوصف: 'System::operator< method. يحدد ما إذا كانت القيمة المحددة أصغر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator<() على هذه القيم في C++.'
النوع: docs
الوزن: 28700
عنوان URL: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


يحدد ما إذا كانت القيمة المحددة أصغر من القيمة التي يمثلها كائن [Nullable](../nullable/) المحدد عن طريق تطبيق [operator<()](./) على هذه القيم.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
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

صحيح إذا كان المقارن الأول أصغر من المقارن الثاني، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


دائمًا تُعيد false.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
العنوان: System::operator> method
عنوان_الرابط: operator>
العنوان_الثاني: Aspose.Font for C++
الوصف: 'System::operator> method. يحدد ما إذا كانت القيمة المحددة أكبر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator>() على هذه القيم في C++.'
النوع: docs
الوزن: 34200
عنوان URL: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


يحدد ما إذا كانت القيمة المحددة أكبر من القيمة التي يمثلها كائن [Nullable](../nullable/) المحدد عن طريق تطبيق [operator>()](./) على هذه القيم.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
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

صحيح إذا كان المقارن الأول أكبر من المقارن الثاني، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


دائمًا تُعيد false.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
