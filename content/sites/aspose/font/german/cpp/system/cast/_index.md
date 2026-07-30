---
title: "Methode System::Cast"
linktitle: "Cast"
second_title: "Aspose.Font für C++"
description: "Methode System::Cast. Führt einen Cast auf SmartPtr‑Objekten in C++ durch."
type: docs
weight: 15400
url: /de/cpp/system/cast/
---
## System::Cast method


Führt einen Cast auf [SmartPtr](../smartptr/)-Objekten durch.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, falls der Cast erlaubt ist.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
