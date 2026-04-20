---
title: "طريقة System::String::Equals"
linktitle: "يساوي"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::Equals. مقارنة مساواة السلاسل. يستخدم وضع المقارنة System::StringComparison::Ordinal في C++."
type: docs
weight: 1100
url: /ar/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../) للمقارنة مع السلسلة الحالية. |

### ReturnValue

صحيح إذا تطابقت السلاسل، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../) للمقارنة مع السلسلة الحالية. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/) (انظر [System::StringComparison](../../stringcomparison/) للتفاصيل). |

### ReturnValue

صحيح إذا تطابقت السلاسل باستخدام نوع المقارنة المحدد، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal-يقارن سلسلتين باستخدام وضع المقارنة Ordial.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |

### ReturnValue

صحيح إذا تطابقت السلاسل، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal-يقارن سلسلتين.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

صحيح إذا تطابقت السلاسل، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
