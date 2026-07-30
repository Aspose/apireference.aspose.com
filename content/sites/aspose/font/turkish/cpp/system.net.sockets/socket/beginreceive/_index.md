---
title: "System::Net::Sockets::Socket::BeginReceive yöntemi"
linktitle: "BeginReceive"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::BeginReceive yöntemi. C++'ta bir asenkron yazma işlemi başlatır."
type: docs
weight: 800
url: /tr/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Asenkron bir yazma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bir tampon. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |
| geri arama | AsyncCallback | İşlem tamamlandığında çağrılacak bir callback. |
| durum | System::SharedPtr\<Object\> | Her bir asenkron alım işlemini benzersiz şekilde tanımlamak için kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan asenkron alım işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
