---
title: "System::Cast_noexcept yöntemi"
linktitle: "Cast_noexcept"
second_title: "Aspose.Font için C++"
description: "System::Cast_noexcept yöntemi. C++'ta SmartPtr nesneleri üzerinde dönüşüm (cast) gerçekleştirir."
type: docs
weight: 15500
url: /tr/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


[SmartPtr](../smartptr/) nesneleri üzerinde dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçisi. |

### ReturnValue

Dönüştürme izinliyse dönüş sonucu, aksi takdirde nullptr.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
