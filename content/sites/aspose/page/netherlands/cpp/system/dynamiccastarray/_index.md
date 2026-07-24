---
title: "System::DynamicCastArray‑methode"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page voor C++"
description: "System::DynamicCastArray‑methode. Voert het casten van elementen van de opgegeven array naar een ander type uit in C++."
type: docs
weight: 17900
url: /nl/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Voert het casten van elementen van de opgegeven array naar een ander type uit.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parameter | Beschrijving |
| --- | --- |
| Naar | Het type waarnaar de elementen van de opgegeven array moeten worden gecast |
| From | Het type van de elementen van de array‑elementen die moeten worden gecast |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | Gedeelde pointer naar de array die de te casten elementen bevat |

### ReturnValue

Een pointer naar een nieuwe array die elementen van type **To** bevat die equivalent zijn aan de elementen van **from**

## Deprecated
Toegevoegd voor achterwaartse compatibiliteit. Gebruik in plaats daarvan ExplicitCast.

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
