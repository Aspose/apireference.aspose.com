---
title: "System::Cast_noexcept-metod"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page för C++"
description: "System::Cast_noexcept-metod. Utför typkonvertering på SmartPtr-objekt i C++."
type: docs
weight: 15400
url: /sv/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Utför typkonvertering på [SmartPtr](../smartptr/) objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Källpekare. |

### ReturnValue

Cast‑resultat om cast är tillåten eller nullptr annars.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
