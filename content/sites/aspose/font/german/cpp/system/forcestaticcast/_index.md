---
title: "System::ForceStaticCast Methode"
linktitle: "ForceStaticCast"
second_title: "Aspose.Font für C++"
description: "System::ForceStaticCast Methode. Führt ein echtes static_cast auf SmartPtr-Objekten in C++ durch."
type: docs
weight: 20500
url: /de/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Führt ein echtes static_cast auf [SmartPtr](../smartptr/)-Objekten durch.

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

Das Cast-Ergebnis, falls das Casten erlaubt ist; andernfalls ist das Verhalten undefiniert.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
