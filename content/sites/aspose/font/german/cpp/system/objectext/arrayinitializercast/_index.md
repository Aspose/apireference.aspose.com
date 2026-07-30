---
title: "System::ObjectExt::ArrayInitializerCast-Methode"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::ArrayInitializerCast-Methode. Konvertiert grundlegende Array-Werte (die C# implizit erledigt, C++ jedoch anscheinend nicht) in C++."
type: docs
weight: 100
url: /de/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Konvertiert grundlegende Array-Werte (was C# implizit tut, C++ jedoch anscheinend nicht).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Zieltyp. |
| From | Quelltypen. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | Von ... | Werte zum Konvertieren und in das Zielarray einfügen. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
