---
title: "طريقة System::ObjectExt::CoalesceInternal"
linktitle: "CoalesceInternal"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::CoalesceInternal. تنفيذ ترجمة المشغل ''??'' للأنواع غير القابلة للإلغاء. تحميل زائد للحالة إذا كان RT2 قابلًا للتحويل إلى RT1 في C++."
type: docs
weight: 700
url: /ar/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


تنفيذ ترجمة العامل '??' للأنواع غير القابلة للـ null. تحميل زائد للحالة إذا كان RT2 قابلًا للتحويل إلى RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| معامل | الوصف |
| --- | --- |
| T0 | نوع قيمة الجانب الأيسر. |
| T1 | نوع الدالة اللامية التي تغلف تعبير الجانب الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | RT1 | قيمة الجانب الأيسر. |
| دالة | F | تعبير RHS. |

### ReturnValue

إذا لم تكن قيمة LHS فارغة (null)، تُرجع LHS، وإلا تحسب تعبير RHS وتُرجع النتيجة.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
