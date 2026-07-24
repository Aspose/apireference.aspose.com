---
title: "System::String::LastIndexOfAny طريقة"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Page لـ C++"
description: "System::String::LastIndexOfAny طريقة. يبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها باتجاه الخلف. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن السابق وهكذا. يُرجع فهرس أول تطابق يُعثر عليه في C++."
type: docs
weight: 2500
url: /ar/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


يبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها بصورة خلفية. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن الحرف السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |

### ReturnValue

فهرس آخر حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي بصورة خلفية. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن الحرف السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء بالبحث منه. |

### ReturnValue

فهرس آخر حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي بصورة خلفية. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن الحرف السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) من الأحرف للبحث عنها. لا يهم الترتيب. |
| startindex | int32_t | الفهرس للبدء بالبحث منه. |
| count | int32_t | عدد الأحرف للبحث عبرها. |

### ReturnValue

فهرس آخر حرف متطابق أو -1 إذا لم يُعثر عليه.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
