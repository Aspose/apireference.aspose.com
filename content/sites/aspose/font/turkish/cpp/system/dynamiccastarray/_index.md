---
title: "System::DynamicCastArray yöntemi"
linktitle: "DinamikDönüştürmeDizisi"
second_title: "Aspose.Font için C++"
description: "System::DynamicCastArray yöntemi. Belirtilen dizinin öğelerinin C++'ta farklı bir tipe dönüştürülmesini gerçekleştirir."
type: docs
weight: 18000
url: /tr/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Belirtilen dizinin öğelerinin farklı bir tipe dönüştürülmesini gerçekleştirir.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parametre | Açıklama |
| --- | --- |
| Şu | Belirtilen dizinin öğelerinin dönüştürüleceği tip |
| From | Dönüştürülecek öğelerin bulunduğu dizinin öğelerinin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| başlangıç | const SharedPtr\<Array\<From\>\>\& | Dönüştürülecek öğeleri içeren diziye ait paylaşımlı gösterici |

### ReturnValue

Tipi **To** olan ve **from** öğelerine eşdeğer öğeler içeren yeni bir diziye işaretçi

## Deprecated
Geriye dönük uyumluluk için eklendi. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
