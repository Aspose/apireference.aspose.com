---
title: "طريقة System::ObjectExt::Coalesce"
linktitle: "Coalesce"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::Coalesce. تنفيذ ترجمة المشغل ''??'' للأنواع القابلة للإلغاء في C++."
type: docs
weight: 500
url: /ar/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


تنفيذ ترجمة العامل '??' للأنواع القابلة للـ null.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| معامل | الوصف |
| --- | --- |
| T0 | نوع قيمة الجانب الأيسر. |
| T1 | نوع الدالة اللامية التي تغلف تعبير الجانب الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | System::Nullable\<T0\> | قيمة الجانب الأيسر. |
| دالة | T1 | تعبير RHS. |

### ReturnValue

إذا لم تكن قيمة LHS فارغة (null)، تُرجع LHS، وإلا تحسب تعبير RHS وتُرجع النتيجة.

## انظر أيضًا

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


تنفيذ ترجمة العامل '??' للأنواع غير القابلة للـ null.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| معامل | الوصف |
| --- | --- |
| T0 | نوع قيمة الجانب الأيسر. |
| T1 | نوع الدالة اللامية التي تغلف تعبير الجانب الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | T0 | قيمة الجانب الأيسر. |
| دالة | T1 | تعبير RHS. |

### ReturnValue

إذا لم تكن قيمة LHS فارغة (null)، تُرجع LHS، وإلا تحسب تعبير RHS وتُرجع النتيجة.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
