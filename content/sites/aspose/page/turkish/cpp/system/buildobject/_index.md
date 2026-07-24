---
title: "System::BuildObject method"
linktitle: "BuildObject"
second_title: "Aspose.Page için C++"
description: "System::BuildObject yöntemi. C++'da paylaşımlı sahiplikle bir nesne oluştur."
type: docs
weight: 15200
url: /tr/cpp/system/buildobject/
---
## System::BuildObject method


Paylaşımlı sahiplikle bir nesne oluştur.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parameter | Açıklama |
| --- | --- |
| T | Oluşturulacak nesnenin türü |
| Argümanlar | Nesne oluşturma için argüman tipleri |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| args | Args\&&... | Nesne yapıcısına iletilecek argümanlar |

### ReturnValue

Paylaşımlı işaretçi oluşturma için yapılandırılmış ObjectBuilder
## Açıklamalar



Bir [SharedPtr<T>](../sharedptr/) oluşturur ve onun için bir oluşturucu döndürür
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
