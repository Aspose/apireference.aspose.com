---
title: "System::Net::Sockets::NetworkStream::BeginWrite metodu"
linktitle: "BeginWrite"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite metodu. C++'ta asenkron bir yazma işlemi başlatır."
type: docs
weight: 400
url: /tr/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Asenkron bir yazma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Yazılacak verileri içeren bir tampon. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Yazılacak bayt sayısı. |
| geri çağırma | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri arama. |
| durum | System::SharedPtr\<Object\> | Her asenkron yazma işlemini benzersiz şekilde tanımlamak için kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan asenkron yazma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
