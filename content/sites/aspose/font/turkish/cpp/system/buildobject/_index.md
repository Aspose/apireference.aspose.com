---
title: "System::BuildObject yöntemi"
linktitle: "BuildObject"
second_title: "Aspose.Font için C++"
description: "System::BuildObject yöntemi. C++'ta paylaşımlı sahipliğe sahip bir nesne oluşturur."
type: docs
weight: 15300
url: /tr/cpp/system/buildobject/
---
## System::BuildObject method


Paylaşımlı sahipliğe sahip bir nesne oluştur.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parametre | Açıklama |
| --- | --- |
| T | Oluşturulacak nesnenin türü |
| Args | Nesne oluşturma için argüman türleri |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| args | Args\&&... | Nesne yapıcısına iletilecek argümanlar |

### ReturnValue

Paylaşımlı gösterici oluşturma için yapılandırılmış ObjectBuilder
## Açıklamalar



Creates a [SharedPtr<T>](../sharedptr/) and returns a builder for it
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
