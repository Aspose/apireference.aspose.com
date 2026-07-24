---
title: "System::Compare method"
linktitle: "Compare"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Compare. تقارن قيمتين في C++."
type: docs
weight: 15800
url: /ar/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


يقارن قيمتين.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | الوصف |
| --- | --- |
| TA | نوع المقارن الأول |
| TB | نوع المقارن الثاني |

| Parameter | Type | الوصف |
| --- | --- | --- |
| a | const TA\& | المقارنة الأولى |
| b | const TB\& | المقارنة الثانية |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


يقارن قيمتين عائمة.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | الوصف |
| --- | --- |
| TA | نوع المقارن الأول |
| TB | نوع المقارن الثاني |

| Parameter | Type | الوصف |
| --- | --- | --- |
| a | const TA\& | المقارنة الأولى |
| b | const TB\& | المقارنة الثانية |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
