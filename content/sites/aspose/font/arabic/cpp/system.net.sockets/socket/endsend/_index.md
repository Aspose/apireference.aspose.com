---
title: "System::Net::Sockets::Socket::EndSend method"
linktitle: "EndSend"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::Socket::EndSend. تنتظر حتى تكتمل عملية الإرسال غير المتزامنة المحددة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


ينتظر حتى تكتمل عملية الإرسال غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية إرسال غير متزامنة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


ينتظر حتى تكتمل عملية الإرسال غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية إرسال غير متزامنة. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
