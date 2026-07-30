---
title: "System::Cast_noexcept-Methode"
linktitle: "Cast_noexcept"
second_title: "Aspose.Font für C++"
description: "System::Cast_noexcept-Methode. Führt einen Cast auf SmartPtr-Objekten in C++ durch."
type: docs
weight: 15500
url: /de/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Führt einen Cast auf [SmartPtr](../smartptr/)-Objekten durch.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, wenn der Cast erlaubt ist, sonst nullptr.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
