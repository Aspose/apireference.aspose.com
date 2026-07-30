---
title: "System::Net::Sockets::NetworkStream::BeginRead yöntemi"
linktitle: "BeginRead"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::NetworkStream::BeginRead yöntemi. C++'da bir eşzamansız okuma işlemi başlatır."
type: docs
weight: 300
url: /tr/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


Asenkron bir okuma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Okunacak bayt sayısı. |
| geri arama | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Her bir eşzamansız okuma işlemini benzersiz şekilde tanımlamak için kullanılan kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamansız okuma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
