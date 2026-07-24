---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket yöntemi"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket yöntemi. C++'de bir eşzamanlı kabul işlemi başlatır."
type: docs
weight: 500
url: /tr/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


Asenkron bir kabul işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| geri çağırma | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Her eşzamanlı bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan, kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamanlı kabul işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
