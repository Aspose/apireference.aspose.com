---
title: "طريقة System::String::LastIndexOf"
linktitle: "LastIndexOf"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::LastIndexOf. البحث العكسي عن حرف في C++."
type: docs
weight: 2400
url: /ar/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


بحث خلفي عن الحرف.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | char_t | الحرف المراد البحث عنه. |

### ReturnValue

فهرس آخر موضع للحرف أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


بحث خلفي عن الحرف.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | char_t | الحرف المراد البحث عنه. |
| startIndex | int32_t | الفهرس للبدء بالبحث عنده. |

### ReturnValue

فهرس آخر موضع للحرف منذ startIndex أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


بحث خلفي عن الحرف.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | char_t | الحرف المراد البحث عنه. |
| startIndex | int32_t | الفهرس للبدء بالبحث عنده. |
| count | int32_t | عدد الأحرف للبحث عبرها |

### ReturnValue

فهرس آخر موضع للحرف منذ startIndex أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


بحث خلفي عن الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | الجزء الفرعي المراد البحث عنه. |
| startIndex | int | الموضع في سلسلة المصدر للبدء بالبحث عبره. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

فهرس آخر جزء فرعي تم العثور عليه أو -1 إذا لم يُعثر عليه. بالنسبة لسلسلة بحث فارغة، دائمًا يُعيد طول السلسلة.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


بحث خلفي عن الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | الجزء الفرعي المراد البحث عنه. |
| startIndex | int | الموضع في سلسلة المصدر للبدء بالبحث عبره. |

### ReturnValue

فهرس آخر جزء فرعي تم العثور عليه أو -1 إذا لم يُعثر عليه. بالنسبة لسلسلة بحث فارغة، دائمًا يُعيد طول السلسلة.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


بحث خلفي عن الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | الجزء الفرعي المراد البحث عنه. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

فهرس آخر جزء فرعي تم العثور عليه أو -1 إذا لم يُعثر عليه. بالنسبة لسلسلة بحث فارغة، دائمًا يُعيد طول السلسلة.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


بحث خلفي عن الجزء الفرعي.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | الجزء الفرعي المراد البحث عنه. |
| startIndex | int | الموضع في سلسلة المصدر للبدء بالبحث عبره. |
| count | int | عدد الأحرف للبحث عبرها. |
| comparisonType | StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

فهرس آخر جزء فرعي تم العثور عليه أو -1 إذا لم يُعثر عليه. بالنسبة لسلسلة بحث فارغة، دائمًا يُعيد startIndex+count.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
