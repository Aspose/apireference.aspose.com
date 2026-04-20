---
title: "طريقة System::String::LastIndexOfAny"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::LastIndexOfAny. تبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها باتجاه الخلف. تقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم تقارن السابق وهكذا. تُعيد فهرس أول تطابق يُعثر عليه في C++."
type: docs
weight: 2500
url: /ar/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


يبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها بشكل عكسي. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |

### ReturnValue

فهرس آخر حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي بشكل عكسي. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء في البحث من. |

### ReturnValue

فهرس آخر حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي بشكل عكسي. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء في البحث من. |
| count | int32_t | عدد الأحرف للبحث عبرها. |

### ReturnValue

فهرس آخر حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
