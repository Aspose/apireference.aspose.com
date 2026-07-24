---
title: "System::ForceStaticCast‑metod"
linktitle: "TvingaStatiskKast"
second_title: "Aspose.Page för C++"
description: "System::ForceStaticCast‑metod. Utför en riktig statisk kastning på SmartPtr‑objekt i C++."
type: docs
weight: 20400
url: /sv/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Utför en riktig statisk kastning på [SmartPtr](../smartptr/)‑objekt.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Källpekare. |

### ReturnValue

Kasta resultatet om kastet är tillåtet, annars är beteendet odefinierat.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
