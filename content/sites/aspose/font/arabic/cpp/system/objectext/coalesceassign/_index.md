---
title: "طريقة System::ObjectExt::CoalesceAssign"
linktitle: "CoalesceAssign"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::CoalesceAssign. تنفيذ ترجمة العامل ''??='' في C++."
type: docs
weight: 600
url: /ar/cpp/system/objectext/coalesceassign/
---
## ObjectExt::CoalesceAssign method


تنفيذ ترجمة العامل '??='.

```cpp
template<typename T0,typename T1> static T0 & System::ObjectExt::CoalesceAssign(T0 &value, T1 func)
```


| معامل | الوصف |
| --- | --- |
| T0 | نوع قيمة الجانب الأيسر. |
| T1 | نوع الدالة اللامية التي تغلف تعبير الجانب الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | T0\\& | قيمة الجانب الأيسر. |
| دالة | T1 | تعبير RHS. |

### ReturnValue

إذا لم تكن قيمة LHS فارغة (null)، تُرجع LHS، وإلا تحسب تعبير RHS وتُرجع النتيجة.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
