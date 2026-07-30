---
title: "System::ForceStaticCast yöntemi"
linktitle: "ZorlaStatikDönüştürme"
second_title: "Aspose.Font için C++"
description: "System::ForceStaticCast yöntemi. C++'ta SmartPtr nesneleri üzerinde gerçek statik dönüşüm gerçekleştirir."
type: docs
weight: 20500
url: /tr/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Gerçek statik dönüşümü [SmartPtr](../smartptr/) nesneleri üzerinde gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçisi. |

### ReturnValue

Dönüşüm izinliyse dönüşüm sonucunu al, aksi takdirde davranış tanımsızdır.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
