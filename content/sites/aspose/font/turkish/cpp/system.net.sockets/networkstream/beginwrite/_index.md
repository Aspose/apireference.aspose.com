---
title: "System::Net::Sockets::NetworkStream::BeginWrite metodu"
linktitle: "BeginWrite"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite metodu. C++'ta bir eşzamanlı olmayan yazma işlemi başlatır."
type: docs
weight: 400
url: /tr/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Asenkron bir yazma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Yazılacak verileri içeren bir tampon. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Yazılacak bayt sayısı. |
| geri arama | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Her bir eşzamanlı olmayan yazma işlemini benzersiz şekilde tanımlamak için kullanılan kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamanlı olmayan yazma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
