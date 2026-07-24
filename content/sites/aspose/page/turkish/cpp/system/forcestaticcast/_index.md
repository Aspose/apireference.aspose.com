---
title: "System::ForceStaticCast metodu"
linktitle: "ZorlaStatikDönüştürme"
second_title: "Aspose.Page için C++"
description: "System::ForceStaticCast metodu. C++'ta SmartPtr nesneleri üzerinde gerçek static cast gerçekleştirir."
type: docs
weight: 20400
url: /tr/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


[SmartPtr](../smartptr/) nesneleri üzerinde gerçek static cast gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tip. |
| TFrom | Kaynak işaretlenen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçi. |

### ReturnValue

Dönüştürme izinliyse sonucu dönüştür, aksi takdirde davranış tanımsızdır.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
