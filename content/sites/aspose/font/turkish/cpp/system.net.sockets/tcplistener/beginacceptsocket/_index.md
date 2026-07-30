---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket yöntemi"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket yöntemi. C++'ta asenkron bir kabul işlemi başlatır."
type: docs
weight: 500
url: /tr/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


Asenkron bir kabul işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | AsyncCallback | İşlem tamamlandığında çağrılacak bir callback. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan, her asenkron bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan veri. |

### ReturnValue

Başlatılan asenkron kabul işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
