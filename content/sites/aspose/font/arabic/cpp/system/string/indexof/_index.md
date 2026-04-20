---
title: "طريقة System::String::IndexOf"
linktitle: "IndexOf"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::IndexOf. بحث أمامي عن حرف في سلسلة فرعية في C++."
type: docs
weight: 1500
url: /ar/cpp/system/string/indexof/
---
## String::IndexOf(char_t, int, int) const method


البحث الأمامي عن الحرف في السلسلة الفرعية.

```cpp
int System::String::IndexOf(char_t c, int startIndex, int count) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| c | char_t | الحرف المراد البحث عنه. |
| startIndex | int | الفهرس للبدء بالبحث عنده. |
| count | int | عدد الأحرف للبحث عبرها. |

### ReturnValue

فهرس موضع الحرف الأول منذ startIndex أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOf(char_t, int) const method


البحث الأمامي عن الحرف.

```cpp
int System::String::IndexOf(char_t c, int startIndex=0) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| c | char_t | الحرف المراد البحث عنه. |
| startIndex | int | الفهرس للبدء بالبحث عنده. |

### ReturnValue

فهرس موضع الحرف الأول منذ startIndex أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOf(const String\&, int, int) const method


بحث أمامي عن الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, int startIndex, int count) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | الجزء الفرعي المراد البحث عنه. |
| startIndex | int | الموضع في سلسلة المصدر للبدء بالبحث عبره. |
| count | int | عدد الأحرف للبحث خلالها. |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOf(const String\&, int, System::StringComparison) const method


بحث أمامي عن الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | الجزء الفرعي المراد البحث عنه. |
| startIndex | int | الموضع في سلسلة المصدر للبدء بالبحث عبره. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOf(const String\&, int) const method


بحث أمامي عن الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, int startIndex=0) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | الجزء الفرعي المراد البحث عنه. |
| startIndex | int | الموضع في سلسلة المصدر للبدء بالبحث عبره. |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOf(const String\&, System::StringComparison) const method


بحث أمامي عن الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &str, System::StringComparison comparison_type) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | الجزء الفرعي المراد البحث عنه. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع 0.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOf(const String\&, int, int, System::StringComparison) const method


بحث أمامي عن الجزء الفرعي.

```cpp
int System::String::IndexOf(const String &value, int startIndex, int count, System::StringComparison comparisonType) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | الجزء الفرعي المراد البحث عنه. |
| startIndex | int | الموضع في سلسلة المصدر للبدء بالبحث عبره. |
| count | int | عدد الأحرف للبحث خلالها. |
| comparisonType | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

فهرس أول سلسلة فرعية تم العثور عليها أو -1 إذا لم يتم العثور. بالنسبة لسلسلة البحث الفارغة، دائمًا يُرجع startIndex.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
