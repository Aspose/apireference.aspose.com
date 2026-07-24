---
title: "System::Cast_noexcept yöntemi"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page için C++"
description: "System::Cast_noexcept yöntemi. C++'da SmartPtr nesneleri üzerinde dönüşüm gerçekleştirir."
type: docs
weight: 15400
url: /tr/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


[SmartPtr](../smartptr/) nesneleri üzerinde dönüşüm gerçekleştirir.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tip. |
| TFrom | Kaynak işaretlenen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Kaynak işaretçi. |

### ReturnValue

Dönüşüm izin veriliyorsa dönüşüm sonucu, aksi takdirde nullptr.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
