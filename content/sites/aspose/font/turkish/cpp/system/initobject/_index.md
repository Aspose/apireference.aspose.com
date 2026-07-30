---
title: "System::InitObject method"
linktitle: "NesneBaşlat"
second_title: "Aspose.Font için C++"
description: "System::InitObject yöntemi. C++'da paylaşımlı sahiplikle bir nesnenin başlatılmasını başlatır."
type: docs
weight: 21900
url: /tr/cpp/system/initobject/
---
## System::InitObject method


Paylaşımlı sahiplikle bir nesnenin başlatılmasını başlatır.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parametre | Açıklama |
| --- | --- |
| T | Başlatılacak nesnenin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) başlatmak için |

### ReturnValue

Paylaşımlı gösterici oluşturma için yapılandırılmış ObjectBuilder
## Açıklamalar



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
