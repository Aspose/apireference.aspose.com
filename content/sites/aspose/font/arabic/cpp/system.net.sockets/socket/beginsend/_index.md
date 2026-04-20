---
title: "System::Net::Sockets::Socket::BeginSend طريقة"
linktitle: "BeginSend"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::Socket::BeginSend طريقة. يبدأ عملية إرسال غير متزامنة في C++."
type: docs
weight: 900
url: /ar/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


يبدأ عملية إرسال غير متزامنة.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مخزن مؤقت لقراءة البيانات منه. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| استدعاء رد | AsyncCallback | استدعاء رد نداء سيتم استدعاؤه عندما تكتمل العملية. |
| الحالة | System::SharedPtr\<Object\> | البيانات التي يوفرها المستخدم وتُستخدم لتحديد كل عملية إرسال غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية الإرسال غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
