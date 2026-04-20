---
title: "طريقة System::operator+"
linktitle: "operator+"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::operator+. دمج السلاسل في C++."
type: docs
weight: 27600
url: /ar/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| يسار | const char_t | حرف للدمج مع السلسلة. |
| right | const String\& | [String](../string/) للدمج. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


يعيد نسخة جديدة من فئة [Decimal](../decimal/) تمثل قيمة هي مجموع القيمة المحددة والقيمة التي يمثلها كائن [Decimal](../decimal/) المحدد.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const T\& | المجمع الأول |
| d | const Decimal\& | المرجع الثابت إلى كائن [Decimal](../decimal/) الذي يمثل المُجمع الثاني |

### ReturnValue

نسخة جديدة من فئة [Decimal](../decimal/) تمثل قيمة هي مجموع **x** والقيمة التي يمثلها **d**.

## انظر أيضًا

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


يجمع القيم غير القابلة للفراغ والقابلة للفراغ.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع العامل الأيسر. |
| T2 | نوع العامل الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| بعض | const T1\& | العامل الأيسر. |
| أخرى | const Nullable\<T2\>\& | العامل الأيمن. |

### ReturnValue

نتيجة الجمع.

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


يوصل جميع ردود النداء من المفوض الأيمن إلى نهاية قائمة ردود النداء للمفوض الأيسر.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | المفوض الذي تُضاف إليه ردود النداء. |
| rhv | MulticastDelegate\<T\> | المفوض الذي تُضاف ردود النداء الخاصة به. |

### ReturnValue

يعيد مفوضًا يحتوي على ردود النداء للقيمة اليسرى ثم ردود النداء للجانب الأيمن.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| معامل | الوصف |
| --- | --- |
| T | [String](../string/) نوع حرفي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| يسار | T\& | قيمة حرفية للربط إلى سلسلة. |
| right | const String\& | [String](../string/) للدمج. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| معامل | الوصف |
| --- | --- |
| T | نوع مؤشر [String](../string/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| left | T\& | [String](../string/) مؤشر للربط إلى سلسلة. |
| right | const String\& | [String](../string/) للدمج. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
