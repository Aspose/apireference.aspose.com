---
title: "System::Cast methode"
linktitle: "Cast"
second_title: "Aspose.Page voor C++"
description: "System::Cast methode. Voert een cast uit op SmartPtr‑objecten in C++."
type: docs
weight: 15300
url: /nl/cpp/system/cast/
---
## System::Cast method


Voert een cast uit op [SmartPtr](../smartptr/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Bron‑pointer. |

### ReturnValue

Cast‑resultaat als de cast is toegestaan.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
