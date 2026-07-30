---
title: "طريقة System::Compare"
linktitle: "Compare"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Compare. تقارن قيمتين في C++."
type: docs
weight: 15900
url: /ar/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


تقارن قيمتين.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| معامل | الوصف |
| --- | --- |
| TA | نوع المتقارن الأول |
| TB | نوع المتقارن الثاني |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | const TA\& | المقارن الأول |
| b | const TB\& | المقارن الثاني |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Compare(const TA\&, const TB\&) method


تقارن قيمتين عائمة.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| معامل | الوصف |
| --- | --- |
| TA | نوع المتقارن الأول |
| TB | نوع المتقارن الثاني |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | const TA\& | المقارن الأول |
| b | const TB\& | المقارن الثاني |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
