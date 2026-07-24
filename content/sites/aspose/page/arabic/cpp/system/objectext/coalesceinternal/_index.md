---
title: "طريقة System::ObjectExt::CoalesceInternal"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::CoalesceInternal. تنفيذ ترجمة عامل ''??'' للأنواع غير القابلة للnull. تحميل للحالة إذا كان RT2 قابل للتحويل إلى RT1 في C++."
type: docs
weight: 600
url: /ar/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


تنفيذ ترجمة العامل '??' للأنواع غير القابلة للفرغ. تحميل زائد للحالة إذا كان RT2 قابلًا للتحويل إلى RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | الوصف |
| --- | --- |
| T0 | نوع قيمة LHS. |
| T1 | نوع الدالة اللامدا التي تغلف تعبير RHS. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | RT1 | قيمة LHS. |
| func | F | تعبير RHS. |

### ReturnValue

إذا كانت قيمة LHS غير null، تُرجع LHS، وإلا تحسب تعبير RHS وتُرجع النتيجة.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
