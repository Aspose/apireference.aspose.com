---
title: "System::ObjectExt::ArrayInitializerCast method"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Font pour C++"
description: "System::ObjectExt::ArrayInitializerCast method. Convertit les valeurs fondamentales de tableau (que C# fait implicitement mais C++ ne le fait apparemment pas) en C++."
type: docs
weight: 100
url: /fr/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Convertit les valeurs fondamentales des tableaux (ce que C# fait implicitement mais que C++ ne fait apparemment pas).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Paramètre | Description |
| --- | --- |
| To | Type cible. |
| From | Types source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| args | De ... | Valeurs à convertir et à pousser dans le tableau cible. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
