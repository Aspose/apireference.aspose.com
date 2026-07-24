---
title: "System::DynamicCastArray metodu"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page için C++"
description: "System::DynamicCastArray metodu. Belirtilen dizinin öğelerinin C++'ta farklı bir türe dönüştürülmesini gerçekleştirir."
type: docs
weight: 17900
url: /tr/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Belirtilen dizinin öğelerinin farklı bir türe dönüştürülmesini gerçekleştirir.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parameter | Açıklama |
| --- | --- |
| To | Belirtilen dizinin öğelerinin dönüştürüleceği tip |
| From | Dönüştürülecek öğelerin bulunduğu dizi öğelerinin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | Dönüştürülecek öğeleri içeren diziye ait paylaşımlı gösterici |

### ReturnValue

**To** tipindeki öğeleri **from** öğelerine eşdeğer olarak içeren yeni bir diziye işaretçi

## Deprecated
Geriye dönük uyumluluk için eklendi. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
