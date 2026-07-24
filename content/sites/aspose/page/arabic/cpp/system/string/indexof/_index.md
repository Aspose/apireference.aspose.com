---
title: "طريقة System::String::IndexOf"
linktitle: "IndexOf"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::String::IndexOf. بحث أمامي عن حرف في سلسلة فرعية في C++."
type: docs
weight: 1500
url: /ar/cpp/system/string/indexof/
---
## String::IndexOf(char_t, int, int) const method


بحث أمامي للحرف في الجزء الفرعي.

```cpp
int System::String::IndexOf(char_t c, int startIndex, int count) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| c | char_t | حرف للبحث عنه. |
| startIndex | int | فهرس بدء البحث عند. |
| count | int | عدد الأحرف للبحث عبرها. |

### ReturnValue

مؤشر أول موضع حرف منذ startIndex أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(char_t, int) const method


بحث أمامي للحرف.

```cpp
int System::String::IndexOf(char_t c, int startIndex=0) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| c | char_t | حرف للبحث عنه. |
| startIndex | int | فهرس بدء البحث عند. |

### ReturnValue

مؤشر أول موضع حرف منذ startIndex أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, int) const method


بحث أمامي في الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, int startIndex, int count) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة الفرعية للبحث عنها. |
| startIndex | int | الموضع في السلسلة المصدر لبدء البحث عبره. |
| count | int | عدد الأحرف التي يجب البحث خلالها. |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, System::StringComparison) const method


بحث أمامي في الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة الفرعية للبحث عنها. |
| startIndex | int | الموضع في السلسلة المصدر لبدء البحث عبره. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) وضع. |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int) const method


بحث أمامي في الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, int startIndex=0) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة الفرعية للبحث عنها. |
| startIndex | int | الموضع في السلسلة المصدر لبدء البحث عبره. |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, System::StringComparison) const method


بحث أمامي في الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة الفرعية للبحث عنها. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) وضع. |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع 0.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, int, System::StringComparison) const method


بحث أمامي في الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &value, int startIndex, int count, System::StringComparison comparisonType) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة الفرعية للبحث عنها. |
| startIndex | int | الموضع في السلسلة المصدر لبدء البحث عبره. |
| count | int | عدد الأحرف التي يجب البحث خلالها. |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) وضع. |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور عليها. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
