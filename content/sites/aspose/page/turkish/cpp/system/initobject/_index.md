---
title: "System::InitObject yöntemi"
linktitle: "NesneyiBaşlat"
second_title: "Aspose.Page için C++"
description: "System::InitObject yöntemi. C++'ta paylaşımlı sahiplikle bir nesnenin başlatılmasını başlatır."
type: docs
weight: 21800
url: /tr/cpp/system/initobject/
---
## System::InitObject method


Paylaşımlı sahiplikle bir nesnenin başlatılmasını başlatır.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | Açıklama |
| --- | --- |
| T | Başlatılacak nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | Başlatılacak [Object](../object/) |

### ReturnValue

Paylaşımlı işaretçi oluşturma için yapılandırılmış ObjectBuilder
## Açıklamalar



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
