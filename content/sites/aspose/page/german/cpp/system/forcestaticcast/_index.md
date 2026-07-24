---
title: "System::ForceStaticCast-Methode"
linktitle: "ErzwingeStatischenCast"
second_title: "Aspose.Page für C++"
description: "System::ForceStaticCast-Methode. Führt ein echtes statisches Casting von SmartPtr-Objekten in C++ durch."
type: docs
weight: 20400
url: /de/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Führt ein echtes statisches Casting von [SmartPtr](../smartptr/)-Objekten durch.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Quellzeiger. |

### ReturnValue

Gibt das Cast-Ergebnis zurück, wenn das Casting erlaubt ist, andernfalls ist das Verhalten undefiniert.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
