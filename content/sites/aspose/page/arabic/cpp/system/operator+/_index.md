---
title: "طريقة System::operator+"
linktitle: "operator+"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::operator+ . دمج السلاسل في C++."
type: docs
weight: 27500
url: /ar/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| يسار | const char_t | حرف للدمج مع السلسلة. |
| right | const String\& | [String](../string/) للدمج. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


يرجع نسخة جديدة من الفئة [Decimal](../decimal/) التي تمثل قيمة هي مجموع القيمة المحددة والقيمة التي تمثلها الكائن [Decimal](../decimal/) المحدد.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| x | const T\& | المجمع الأول |
| d | const Decimal\& | المرجع الثابت إلى الكائن [Decimal](../decimal/) الذي يمثل المجمع الثاني |

### ReturnValue

نسخة جديدة من الفئة [Decimal](../decimal/) التي تمثل قيمة هي مجموع **x** والقيمة التي يمثلها **d**.

## انظر أيضًا

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


يجمع القيم غير القابلة للفرغ والقابلة للفرغ.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع العامل الأيسر. |
| T2 | نوع العامل الأيمن. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| بعض | const T1\& | العامل الأيسر. |
| آخر | const Nullable\<T2\>\& | العامل الأيمن. |

### ReturnValue

نتيجة الجمع.

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


يقوم بربط جميع ردود النداء من المفوض اليد اليمنى إلى نهاية قائمة ردود النداء للمفوض اليد اليسرى.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | المفوض الذي تُضاف إليه ردود النداء. |
| rhv | MulticastDelegate\<T\> | المفوض الذي تُضاف ردود النداء الخاصة به. |

### ReturnValue

يرجع مفوضًا يحتوي على ردود النداء للقيمة اليسرى ثم ردود النداء لليد اليمنى.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | الوصف |
| --- | --- |
| T | [String](../string/) نوع الحرفية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| يسار | T\& | قيمة حرفية للربط مع سلسلة. |
| right | const String\& | [String](../string/) للدمج. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع مؤشر [String](../string/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| left | T\& | [String](../string/) مؤشر للربط مع سلسلة. |
| right | const String\& | [String](../string/) للدمج. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
