---
title: "System::Net::Sockets::NetworkStream::BeginRead metodu"
linktitle: "BeginRead"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::NetworkStream::BeginRead metodu. C++'da bir asenkron okuma işlemi başlatır."
type: docs
weight: 300
url: /tr/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


Asenkron bir okuma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Okunacak bayt sayısı. |
| geri çağırma | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri arama. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan ve her asenkron okuma işlemini benzersiz şekilde tanımlamak için kullanılan veri. |

### ReturnValue

Başlatılan asenkron okuma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
