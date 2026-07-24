---
title: "طريقة System::ObjectExt::Coalesce"
linktitle: "Coalesce"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::Coalesce. تنفيذ ترجمة عامل ''??'' لأنواع nullable في C++."
type: docs
weight: 500
url: /ar/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


تنفيذ ترجمة العامل '??' للأنواع القابلة للفرغ.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | الوصف |
| --- | --- |
| T0 | نوع قيمة LHS. |
| T1 | نوع الدالة اللامدا التي تغلف تعبير RHS. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | System::Nullable\<T0\> | قيمة LHS. |
| func | T1 | تعبير RHS. |

### ReturnValue

إذا كانت قيمة LHS غير null، تُرجع LHS، وإلا تحسب تعبير RHS وتُرجع النتيجة.

## انظر أيضًا

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


تنفيذ ترجمة العامل '??' للأنواع غير القابلة للفرغ.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | الوصف |
| --- | --- |
| T0 | نوع قيمة LHS. |
| T1 | نوع الدالة اللامدا التي تغلف تعبير RHS. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | T0 | قيمة LHS. |
| func | T1 | تعبير RHS. |

### ReturnValue

إذا كانت قيمة LHS غير null، تُرجع LHS، وإلا تحسب تعبير RHS وتُرجع النتيجة.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
