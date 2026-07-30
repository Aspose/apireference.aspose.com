---
title: "طريقة System::DynamicCastArray"
linktitle: "تحويل مصفوفة ديناميكي"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::DynamicCastArray. تقوم بتحويل عناصر المصفوفة المحددة إلى نوع مختلف في C++."
type: docs
weight: 18000
url: /ar/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


يقوم بتحويل عناصر المصفوفة المحددة إلى نوع مختلف.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| معامل | الوصف |
| --- | --- |
| إلى | النوع الذي سيتم تحويل عناصر المصفوفة المحددة إليه |
| From | نوع عناصر العناصر في المصفوفة التي سيتم تحويلها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | مؤشر مشترك إلى المصفوفة التي تحتوي على العناصر التي سيتم تحويلها |

### ReturnValue

مؤشر إلى مصفوفة جديدة تحتوي على عناصر من النوع **To** مكافئة لعناصر **from**

## Deprecated
مضاف للتوافق مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
