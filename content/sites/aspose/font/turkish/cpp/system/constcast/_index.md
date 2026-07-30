---
title: "System::ConstCast yöntemi"
linktitle: "SabitDönüştürme"
second_title: "Aspose.Font için C++"
description: "System::ConstCast yöntemi. C++'da kullanımdan kaldırılmış dönüşümlerin sonu."
type: docs
weight: 16200
url: /tr/cpp/system/constcast/
---
## System::ConstCast method


Kullanımdan kaldırılmış dönüşümlerin sonu.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tür. |
| TFrom | Kaynak işaretlenen tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Kaynak işaretçisi. |

### ReturnValue

Dönüştürme izinliyse dönüş sonucu, aksi takdirde nullptr.
## Açıklamalar


[SmartPtr](../smartptr/) nesneleri üzerinde const dönüşüm gerçekleştirir.
## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
