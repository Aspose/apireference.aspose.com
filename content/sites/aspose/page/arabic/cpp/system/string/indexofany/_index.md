---
title: "طريقة System::String::IndexOfAny"
linktitle: "IndexOfAny"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::String::IndexOfAny. بحث أمامي عن الحرف في C++."
type: docs
weight: 1600
url: /ar/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


بحث أمامي للحرف.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
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
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


يبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الحرف الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |

### ReturnValue

مؤشر أول حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الحرف الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء بالبحث منه. |

### ReturnValue

مؤشر أول حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الحرف الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء بالبحث منه. |
| count | int32_t | عدد الأحرف للبحث عبرها. |

### ReturnValue

مؤشر أول حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


وبالتالي يبحث عن جميع أحرف السلسلة str في هذا النص. إذا تم العثور على الحرف الأول، يتم إرجاع موقعه، وإلا يبحث عن الحرف الثاني وهكذا.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../) من الأحرف للبحث عنها. ترتيب الأحرف مهم. |
| startIndex | int | الموضع للبدء بالبحث منه. |

### ReturnValue

فهرس أول حرف تم العثور عليه أو -1 إذا لم يُعثر على أي شيء.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
