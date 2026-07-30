---
title: "طريقة System::Net::Sockets::Socket::BeginReceive"
linktitle: "BeginReceive"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::Socket::BeginReceive. تبدأ عملية كتابة غير متزامنة في C++."
type: docs
weight: 800
url: /ar/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


يبدأ عملية كتابة غير متزامنة.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مخزن مؤقت يتم فيه تعيين البيانات المستلمة. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الاستلام. |
| استدعاء رد | AsyncCallback | استدعاء رد نداء سيتم استدعاؤه عندما تكتمل العملية. |
| الحالة | System::SharedPtr\<Object\> | البيانات التي يقدمها المستخدم وتُستخدم لتحديد كل عملية استقبال غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية الاستقبال غير المتزامنة التي تم بدءها.

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
