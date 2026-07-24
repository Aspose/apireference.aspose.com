---
title: "System::ObjectExt::ArrayInitializerCast methode"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::ArrayInitializerCast methode. Converteert fundamentele array-waarden (wat C# impliciet doet maar C++ blijkbaar niet) in C++."
type: docs
weight: 100
url: /nl/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Converteert fundamentele array‑waarden (wat C# impliciet doet, maar C++ blijkbaar niet).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | Beschrijving |
| --- | --- |
| Naar | Doeltype. |
| From | Bron-types. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| args | Van ... | Waarden om te converteren en naar de doelarray te pushen. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
