---
title: "System::Cast yöntemi"
linktitle: "Cast"
second_title: "Aspose.Page için C++"
description: "System::Cast yöntemi. C++'ta SmartPtr nesneleri üzerinde dönüşüm gerçekleştirir."
type: docs
weight: 15300
url: /tr/cpp/system/cast/
---
## System::Cast method


[SmartPtr](../smartptr/) nesneleri üzerinde dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tip. |
| TFrom | Kaynak işaretlenen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçi. |

### ReturnValue

Dönüşüm izinliyse dönüşüm sonucu.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
