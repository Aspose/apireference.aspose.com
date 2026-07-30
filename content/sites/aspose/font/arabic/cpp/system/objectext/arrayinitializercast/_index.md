---
title: "طريقة System::ObjectExt::ArrayInitializerCast"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::ArrayInitializerCast. يحول القيم الأساسية للمصفوفة (التي يقوم C# بتحويلها ضمنيًا لكن C++ يبدو أنه لا يفعل ذلك) في C++."
type: docs
weight: 100
url: /ar/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


تحول القيم الأساسية للمصفوفة (التي يقوم C# بتحويلها ضمنيًا لكن C++ يبدو أنه لا يفعل ذلك).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| معامل | الوصف |
| --- | --- |
| إلى | النوع الهدف. |
| From | أنواع المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| args | من ... | القيم للتحويل وإدراجها في المصفوفة الهدف. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
