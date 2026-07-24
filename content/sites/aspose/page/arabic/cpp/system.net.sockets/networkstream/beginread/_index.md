---
title: "System::Net::Sockets::NetworkStream::BeginRead طريقة"
linktitle: "BeginRead"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::NetworkStream::BeginRead طريقة. يبدأ عملية قراءة غير متزامنة في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


يبدأ عملية قراءة غير متزامنة.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مصفوفة البايت حيث سيتم كتابة البايتات المقروءة. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم قراءتها. |
| استدعاء رد | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| الحالة | System::SharedPtr\<Object\> | البيانات التي يوفرها المستخدم تُستخدم لتحديد كل عملية قراءة غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية القراءة غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
