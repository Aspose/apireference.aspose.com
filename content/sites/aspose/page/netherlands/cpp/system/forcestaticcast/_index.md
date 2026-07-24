---
title: "System::ForceStaticCast methode"
linktitle: "Forceer statische cast"
second_title: "Aspose.Page voor C++"
description: "System::ForceStaticCast methode. Voert een echte static cast uit op SmartPtr‑objecten in C++."
type: docs
weight: 20400
url: /nl/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Voert een echte static cast uit op [SmartPtr](../smartptr/) objecten.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Bron‑pointer. |

### ReturnValue

Cast‑resultaat als cast is toegestaan, anders is het gedrag ongedefinieerd.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
