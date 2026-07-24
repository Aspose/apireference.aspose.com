---
title: "System::Cast metod"
linktitle: "Cast"
second_title: "Aspose.Page för C++"
description: "System::Cast metod. Utför typkonvertering på SmartPtr-objekt i C++."
type: docs
weight: 15300
url: /sv/cpp/system/cast/
---
## System::Cast method


Utför typkonvertering på [SmartPtr](../smartptr/) objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Källpekare. |

### ReturnValue

Typkonverteringsresultat om konvertering är tillåten.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
