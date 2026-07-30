---
title: "System::Cast yöntemi"
linktitle: "Cast"
second_title: "Aspose.Font için C++"
description: "System::Cast yöntemi. C++'ta SmartPtr nesneleri üzerinde dönüşüm (cast) gerçekleştirir."
type: docs
weight: 15400
url: /tr/cpp/system/cast/
---
## System::Cast method


[SmartPtr](../smartptr/) nesneleri üzerinde dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçisi. |

### ReturnValue

Dönüşüm izinliyse dönüşüm sonucu.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
