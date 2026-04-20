---
title: "طريقة System::Net::Sockets::NetworkStream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::NetworkStream::BeginWrite. تبدأ عملية كتابة غير متزامنة في C++."
type: docs
weight: 400
url: /ar/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


يبدأ عملية كتابة غير متزامنة.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مخزن مؤقت يحتوي على البيانات التي سيتم كتابتها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم كتابتها. |
| استدعاء رد | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| الحالة | System::SharedPtr\<Object\> | البيانات التي يقدمها المستخدم تُستخدم لتحديد كل عملية كتابة غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية الكتابة غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
