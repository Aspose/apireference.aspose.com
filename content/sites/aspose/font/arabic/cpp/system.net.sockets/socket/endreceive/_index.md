---
title: "System::Net::Sockets::Socket::EndReceive طريقة"
linktitle: "EndReceive"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::Socket::EndReceive طريقة. ينتظر حتى يكتمل عملية الاستلام غير المتزامنة المحددة في C++."
type: docs
weight: 1500
url: /ar/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


ينتظر حتى تكتمل عملية الاستقبال غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية استلام غير متزامنة. |

### ReturnValue

عدد البايتات التي تم استلامها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


ينتظر حتى تكتمل عملية الاستقبال غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| معامل | نوع | الوصف |
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
* Library [Aspose.Font for C++](../../../)
