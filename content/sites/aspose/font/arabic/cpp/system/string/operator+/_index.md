---
title: "طريقة System::String::operator+"
linktitle: "operator+"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::operator+ . تضيف حرفًا إلى نهاية السلسلة في C++."
type: docs
weight: 2800
url: /ar/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


يضيف حرفًا إلى نهاية السلسلة.

```cpp
String System::String::operator+(char_t x) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| x | char_t | حرف للإضافة. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../) لإضافتها إلى نهاية الحالي. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| معامل | الوصف |
| --- | --- |
| T | إحدى صيغ النص الحرفي أو مؤشر سلسلة الأحرف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| arg | const T\& | كيان للدمج مع السلسلة الحالية. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


يضيف تمثيل كائن من نوع مرجعي كسلسلة نصية إلى نهاية السلسلة.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| معامل | الوصف |
| --- | --- |
| T | نوع المؤشر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) لتحويل إلى سلسلة باستخدام استدعاء [ToString()](../tostring/) وإضافتها إلى السلسلة الحالية. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


يضيف تمثيل السلسلة لكائن نوع القيمة إلى نهاية السلسلة.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة لاستدعاء [ToString()](../tostring/) عليه. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) لتحويل إلى سلسلة باستخدام استدعاء [ToString()](../tostring/) وإضافتها إلى السلسلة الحالية. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(double) const method


يضيف تمثيل قيمة عدد عائم كسلسلة نصية إلى نهاية السلسلة.

```cpp
String System::String::operator+(double d) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| d | double | القيمة للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int) const method


يضيف تمثيل قيمة عدد صحيح كسلسلة نصية إلى نهاية السلسلة.

```cpp
String System::String::operator+(int i) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int | قيمة عدد صحيح للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int64_t) const method


يضيف تمثيل قيمة عدد صحيح كسلسلة نصية إلى نهاية السلسلة.

```cpp
String System::String::operator+(int64_t v) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| v | int64_t | القيمة للتحويل إلى سلسلة وإضافتها إلى الإضافة. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(T) const method


يضيف تمثيل قيمة منطقية كسلسلة نصية إلى نهاية السلسلة.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة للدمج مع السلسلة. يجب أن يكون bool |

| معامل | نوع | الوصف |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) قيمة للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(uint32_t) const method


يضيف تمثيل قيمة عدد صحيح غير موقع كسلسلة نصية إلى نهاية السلسلة.

```cpp
String System::String::operator+(uint32_t i) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| i | uint32_t | القيمة للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
