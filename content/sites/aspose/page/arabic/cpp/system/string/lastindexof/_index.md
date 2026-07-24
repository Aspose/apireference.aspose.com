---
title: "طريقة System::String::LastIndexOf"
linktitle: "LastIndexOf"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::String::LastIndexOf. بحث عكسي عن حرف في C++."
type: docs
weight: 2400
url: /ar/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


بحث خلفي للحرف.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char_t | حرف للبحث عنه. |

### ReturnValue

فهرس موضع الحرف الأخير أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


بحث خلفي للحرف.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char_t | حرف للبحث عنه. |
| startIndex | int32_t | فهرس بدء البحث عند. |

### ReturnValue

فهرس موضع الحرف الأخير منذ startIndex أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


بحث خلفي للحرف.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char_t | حرف للبحث عنه. |
| startIndex | int32_t | فهرس بدء البحث عند. |
| count | int32_t | عدد الأحرف للبحث عبرها |

### ReturnValue

فهرس موضع الحرف الأخير منذ startIndex أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


بحث خلفي في الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة الفرعية للبحث عنها. |
| startIndex | int | الموضع في السلسلة المصدر لبدء البحث عبره. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) وضع. |

### ReturnValue

فهرس السلسلة الفرعية الأخيرة التي تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا ما يُرجع طول السلسلة.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


بحث خلفي في الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة الفرعية للبحث عنها. |
| startIndex | int | الموضع في السلسلة المصدر لبدء البحث عبره. |

### ReturnValue

فهرس السلسلة الفرعية الأخيرة التي تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا ما يُرجع طول السلسلة.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


بحث خلفي في الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة الفرعية للبحث عنها. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) وضع. |

### ReturnValue

فهرس السلسلة الفرعية الأخيرة التي تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا ما يُرجع طول السلسلة.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


بحث خلفي في الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة الفرعية للبحث عنها. |
| startIndex | int | الموضع في السلسلة المصدر لبدء البحث عبره. |
| count | int | عدد الأحرف للبحث عبرها. |
| comparisonType | StringComparison | [Comparison](../../comparison/) وضع. |

### ReturnValue

فهرس السلسلة الفرعية الأخيرة التي تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا ما يُرجع startIndex+count.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
