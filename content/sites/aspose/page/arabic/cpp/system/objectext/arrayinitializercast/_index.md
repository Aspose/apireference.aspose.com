---
title: "طريقة System::ObjectExt::ArrayInitializerCast"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::ArrayInitializerCast. تقوم بتحويل القيم الأساسية للمصفوفة (التي يقوم C# بتحويلها ضمنيًا لكن C++ يبدو أنه لا يفعل ذلك) في C++."
type: docs
weight: 100
url: /ar/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


يحوّل القيم الأساسية للمصفوفات (التي يقوم C# بتحويلها ضمنيًا لكن C++ يبدو أنه لا يفعل ذلك).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | الوصف |
| --- | --- |
| إلى | نوع الهدف. |
| From | أنواع المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| args | من ... | القيم التي سيتم تحويلها ودفعها إلى مصفوفة الهدف. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
