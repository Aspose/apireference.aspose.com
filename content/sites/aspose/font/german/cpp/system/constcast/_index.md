---
title: "System::ConstCast Methode"
linktitle: "ConstCast"
second_title: "Aspose.Font für C++"
description: "System::ConstCast-Methode. Ende veralteter Casts in C++."
type: docs
weight: 16200
url: /de/cpp/system/constcast/
---
## System::ConstCast method


Ende veralteter Casts.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, wenn der Cast erlaubt ist, sonst nullptr.
## Hinweise


Führt const cast auf [SmartPtr](../smartptr/) Objekten aus.
## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
