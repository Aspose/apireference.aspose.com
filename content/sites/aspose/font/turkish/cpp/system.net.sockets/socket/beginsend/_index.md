---
title: "System::Net::Sockets::Socket::BeginSend metodu"
linktitle: "BeginSend"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::BeginSend metodu. C++'da eşzamanlı olmayan bir gönderim işlemi başlatır."
type: docs
weight: 900
url: /tr/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


Asenkron bir gönderme işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Veri okumak için bir tampon. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |
| geri arama | AsyncCallback | İşlem tamamlandığında çağrılacak bir callback. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan, her asenkron gönderme işlemini benzersiz şekilde tanımlamak için kullanılan veri. |

### ReturnValue

Başlatılan asenkron gönderme işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

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
