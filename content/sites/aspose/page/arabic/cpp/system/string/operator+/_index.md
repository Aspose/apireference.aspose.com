---
title: "طريقة System::String::operator+"
linktitle: "operator+"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::String::operator+. تضيف حرفًا إلى نهاية السلسلة في C++."
type: docs
weight: 2800
url: /ar/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


يضيف حرفًا إلى نهاية السلسلة.

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| x | char_t | الحرف المراد إضافته. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../) لإضافتها إلى نهاية الحالية. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | الوصف |
| --- | --- |
| T | إحدى صيغ النص الحرفي أو مؤشر سلسلة الأحرف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| arg | const T\& | الكيان لدمجه مع السلسلة الحالية. |

### ReturnValue

السلسلة المدمجة.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


يضيف تمثيل كائن من نوع مرجعي كسلسلة إلى نهاية السلسلة.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المؤشر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) للتحويل إلى سلسلة باستخدام استدعاء [ToString()](../tostring/) وإضافتها إلى السلسلة الحالية. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


يضيف تمثيل كائن النوع القيمي كسلسلة إلى نهاية السلسلة.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة لاستدعاء [ToString()](../tostring/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) للتحويل إلى سلسلة باستخدام استدعاء [ToString()](../tostring/) وإضافتها إلى السلسلة الحالية. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


يضيف تمثيل قيمة عدد عشري كسلسلة إلى نهاية السلسلة.

```cpp
String System::String::operator+(double d) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| d | double | القيمة للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


يضيف تمثيل قيمة عدد صحيح كسلسلة إلى نهاية السلسلة.

```cpp
String System::String::operator+(int i) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| i | int | قيمة عدد صحيح للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


يضيف تمثيل قيمة عدد صحيح كسلسلة إلى نهاية السلسلة.

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| v | int64_t | القيمة للتحويل إلى سلسلة وإضافتها إلى الإضافة. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


يضيف تمثيل قيمة منطقية كسلسلة إلى نهاية السلسلة.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة للدمج مع السلسلة. يجب أن يكون bool |

| Parameter | Type | الوصف |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) قيمة للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


يضيف تمثيل قيمة عدد صحيح غير موقع كسلسلة إلى نهاية السلسلة.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| i | uint32_t | القيمة للتحويل إلى سلسلة وإضافتها. |

### ReturnValue

[String](../) concatenation result.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
