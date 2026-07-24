---
title: "System::Net::Sockets::Socket::BeginSend yöntemi"
linktitle: "BeginSend"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::Socket::BeginSend yöntemi. C++'de eşzamanlı olmayan bir gönderme işlemi başlatır."
type: docs
weight: 900
url: /tr/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


Asenkron bir gönderme işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Verileri okumak için bir tampon. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |
| geri çağırma | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Her eşzamanlı olmayan gönderme işlemini benzersiz şekilde tanımlamak için kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamanlı olmayan gönderme işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
