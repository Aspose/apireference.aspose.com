---
title: "طريقة System::String::IndexOfAny"
linktitle: "IndexOfAny"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::IndexOfAny. بحث أمامي عن الحرف في C++."
type: docs
weight: 1600
url: /ar/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


البحث الأمامي عن الحرف.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
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
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


يبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |

### ReturnValue

فهرس أول حرف مطابق أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء في البحث من. |

### ReturnValue

فهرس أول حرف مطابق أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء في البحث من. |
| count | int32_t | عدد الأحرف للبحث عبرها. |

### ReturnValue

فهرس أول حرف مطابق أو -1 إذا لم يتم العثور عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


وبالتالي يبحث عن جميع أحرف السلسلة str في هذا. إذا تم العثور على الحرف الأول، تُرجع موقعه، وإلا يبحث عن الحرف الثاني وهكذا.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../) من الأحرف للبحث عنها. ترتيب الأحرف مهم. |
| startIndex | int | الموضع للبدء بالبحث منه. |

### ReturnValue

فهرس أول حرف تم العثور عليه أو -1 إذا لم يتم العثور على أي شيء.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
