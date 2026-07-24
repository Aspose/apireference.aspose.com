---
title: "طريقة System::Net::Sockets::Socket::EndSend"
linktitle: "EndSend"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Sockets::Socket::EndSend. ينتظر حتى يكتمل عملية الإرسال غير المتزامنة المحددة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


ينتظر حتى يكتمل عملية الإرسال غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية إرسال غير متزامنة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


ينتظر حتى يكتمل عملية الإرسال غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية إرسال غير متزامنة. |
| errorCode | SocketError\& | معامل الإخراج حيث سيتم تعيين رمز الخطأ عندما تفشل عملية الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
