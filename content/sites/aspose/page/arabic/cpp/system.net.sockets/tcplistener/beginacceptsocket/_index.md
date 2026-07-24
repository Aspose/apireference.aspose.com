---
title: "طريقة System::Net::Sockets::TcpListener::BeginAcceptSocket"
linktitle: "BeginAcceptSocket"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Sockets::TcpListener::BeginAcceptSocket. يبدأ عملية قبول غير متزامنة في C++."
type: docs
weight: 500
url: /ar/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


يبدأ عملية قبول غير متزامنة.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | AsyncCallback | دالة رد سيتم استدعاؤها عند إكمال العملية. |
| الحالة | System::SharedPtr\<Object\> | بيانات يقدمها المستخدم تُستخدم لتحديد كل عملية اتصال غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية القبول غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
