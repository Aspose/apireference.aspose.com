---
title: "System::ObjectExt::ArrayInitializerCast-metod"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::ArrayInitializerCast-metod. Konverterar grundläggande array-värden (vilket C# gör implicit men C++ tydligen inte) i C++."
type: docs
weight: 100
url: /sv/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Konverterar grundläggande arrayvärden (vilket C# gör implicit men C++ uppenbarligen inte gör).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | Beskrivning |
| --- | --- |
| Till | Målt typ. |
| From | Källtyper. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| args | Från ... | Värden att konvertera och skjuta in i målarrayen. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Se även

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
