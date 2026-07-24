---
title: "System::ConstCast yöntemi"
linktitle: "ConstCast"
second_title: "Aspose.Page için C++"
description: "System::ConstCast yöntemi. C++'da kullanımdan kaldırılmış dönüşümlerin sonu."
type: docs
weight: 16100
url: /tr/cpp/system/constcast/
---
## System::ConstCast method


Kullanımdan kaldırılmış dönüşümlerin sonu.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| TTo | Hedef işaretlenen tip. |
| TFrom | Kaynak işaretlenen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Kaynak işaretçi. |

### ReturnValue

Dönüşüm izin veriliyorsa dönüşüm sonucu, aksi takdirde nullptr.
## Açıklamalar


[SmartPtr](../smartptr/) nesneleri üzerinde const dönüşüm gerçekleştirir.
## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
