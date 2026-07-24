---
title: "طريقة System::operator*"
linktitle: "operator*"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::operator*. تُرجع نسخة جديدة من الصف Decimal تمثل قيمة ناتجة عن ضرب القيمة المحددة والقيمة الممثلة بواسطة كائن Decimal المحدد في C++."
type: docs
weight: 27400
url: /ar/cpp/system/operator_/
---
## System::operator* method


تُرجع نسخة جديدة من الصف [Decimal](../decimal/) تمثل قيمة ناتجة عن ضرب القيمة المحددة والقيمة الممثلة بواسطة كائن [Decimal](../decimal/) المحدد.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| x | const T\& | المضاعف الأول |
| d | const Decimal\& | الكائن [Decimal](../decimal/) الذي يمثل المضاعف الثاني |

### ReturnValue

نسخة جديدة من الصف [Decimal](../decimal/) تمثل قيمة ناتجة عن ضرب **x** والقيمة الممثلة بواسطة **d**.

## انظر أيضًا

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
العنوان: طريقة System::operator<
عنوان الرابط: operator<
العنوان_الثاني: Aspose.Page for C++
الوصف: 'System::operator< طريقة. يحدد ما إذا كانت القيمة المحددة أصغر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator<() على هذه القيم في C++.'
النوع: docs
الوزن: 28600
الرابط: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


يحدد ما إذا كانت القيمة المحددة أصغر من القيمة التي يمثلها كائن [Nullable](../nullable/) المحدد عن طريق تطبيق [operator<()](./) على هذه القيم.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع القيمة المقارنة الأولى |
| T2 | النوع الأساسي لكائن [Nullable](../nullable/) الذي يمثل القيمة المقارنة الثانية |

| Parameter | Type | الوصف |
| --- | --- | --- |
| بعض | const T1\& | مرجع ثابت إلى القيمة التي ستُستخدم كقيمة مقارنة أولى |
| other | const Nullable\<T2\>\& | مرجع ثابت إلى كائن [Nullable](../nullable/) الذي تُستخدم قيمته الممثلة كقيمة مقارنة ثانية |

### ReturnValue

صحيح إذا كان المقارن الأول أصغر من المقارن الثاني، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


دائمًا ما تُعيد false.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
العنوان: System::operator> طريقة
عنوان الارتباط: operator>
العنوان_الثاني: Aspose.Page for C++
الوصف: 'System::operator> طريقة. يحدد ما إذا كانت القيمة المحددة أكبر من القيمة التي يمثلها كائن Nullable المحدد عن طريق تطبيق operator>() على هذه القيم في C++.'
النوع: docs
الوزن: 34100
الرابط: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


يحدد ما إذا كانت القيمة المحددة أكبر من القيمة التي يمثلها كائن [Nullable](../nullable/) المحدد عن طريق تطبيق [operator>()](./) على هذه القيم.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع القيمة المقارنة الأولى |
| T2 | النوع الأساسي لكائن [Nullable](../nullable/) الذي يمثل القيمة المقارنة الثانية |

| Parameter | Type | الوصف |
| --- | --- | --- |
| بعض | const T1\& | مرجع ثابت إلى القيمة التي ستُستخدم كقيمة مقارنة أولى |
| other | const Nullable\<T2\>\& | مرجع ثابت إلى كائن [Nullable](../nullable/) الذي تُستخدم قيمته الممثلة كقيمة مقارنة ثانية |

### ReturnValue

صحيح إذا كان المقارن الأول أكبر من المقارن الثاني، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


دائمًا ما تُعيد false.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
