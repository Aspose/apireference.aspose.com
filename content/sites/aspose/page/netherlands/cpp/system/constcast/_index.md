---
title: "System::ConstCast-methode"
linktitle: "ConstCast"
second_title: "Aspose.Page voor C++"
description: "System::ConstCast-methode. Einde van verouderde casts in C++."
type: docs
weight: 16100
url: /nl/cpp/system/constcast/
---
## System::ConstCast method


Einde van verouderde casts.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Bron‑pointer. |

### ReturnValue

Castresultaat als cast is toegestaan, anders nullptr.
## Opmerkingen


Voert const-cast uit op [SmartPtr](../smartptr/) objecten.
## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
