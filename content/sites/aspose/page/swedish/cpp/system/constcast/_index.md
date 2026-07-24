---
title: "System::ConstCast metod"
linktitle: "ConstCast"
second_title: "Aspose.Page för C++"
description: "System::ConstCast metod. Slutet på föråldrade kast i C++."
type: docs
weight: 16100
url: /sv/cpp/system/constcast/
---
## System::ConstCast method


Slutet på föråldrade kast.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Källpekare. |

### ReturnValue

Cast‑resultat om cast är tillåten eller nullptr annars.
## Anmärkningar


Utför const‑kast på [SmartPtr](../smartptr/) objekt.
## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
