---
title: "طريقة System::Net::Sockets::Socket::EndReceive"
linktitle: "EndReceive"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Sockets::Socket::EndReceive. تنتظر حتى تكتمل عملية الاستلام غير المتزامنة المحددة في C++."
type: docs
weight: 1500
url: /ar/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


ينتظر حتى يكتمل عملية الاستلام غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية استلام غير متزامنة. |

### ReturnValue

عدد البايتات التي تم استلامها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


ينتظر حتى يكتمل عملية الاستلام غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية استلام غير متزامنة. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
