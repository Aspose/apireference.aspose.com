---
title: "طريقة System::IO::Stream::BeginRead"
linktitle: "BeginRead"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::Stream::BeginRead. تبدأ عملية قراءة غير متزامنة في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


يبدأ عملية قراءة غير متزامنة.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مخزن مؤقت للقراءة إليه |
| الإزاحة | int | إزاحة تبدأ من الصفر في **buffer** تشير إلى الموضع الذي يبدأ منه كتابة البيانات المقروءة |
| count | int | عدد البايتات التي يجب قراءتها |
| استدعاء رد | System::AsyncCallback | استدعاء رد نداء يُستدعى عند إكمال العملية |
| الحالة | System::SharedPtr\<System::Object\> | بيانات مقدمة من المستخدم تُستخدم لتحديد كل عملية قراءة غير متزامنة بشكل فريد |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية القراءة غير المتزامنة التي تم بدءها

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
