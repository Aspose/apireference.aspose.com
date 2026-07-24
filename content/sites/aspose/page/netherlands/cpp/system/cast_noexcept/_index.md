---
title: "System::Cast_noexcept methode"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page voor C++"
description: "System::Cast_noexcept methode. Voert een cast uit op SmartPtr-objecten in C++."
type: docs
weight: 15400
url: /nl/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Voert een cast uit op [SmartPtr](../smartptr/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Bron‑pointer. |

### ReturnValue

Castresultaat als cast is toegestaan, anders nullptr.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
