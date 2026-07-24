---
title: "طريقة System::IO::Stream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::Stream::BeginWrite. تبدأ عملية كتابة غير متزامنة في C++."
type: docs
weight: 200
url: /ar/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


يبدأ عملية كتابة غير متزامنة.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مخزن مؤقت يحتوي على البيانات التي سيتم كتابتها |
| الإزاحة | int | إزاحة ذات أساس صفر في **buffer** تشير إلى الموضع الذي تبدأ منه البيانات للكتابة |
| count | int | عدد البايتات التي سيتم كتابتها |
| استدعاء رد | System::AsyncCallback | استدعاء رد نداء يُستدعى عند إكمال العملية |
| الحالة | System::SharedPtr\<System::Object\> | بيانات مقدمة من المستخدم تُستخدم لتحديد كل عملية كتابة غير متزامنة بشكل فريد |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية الكتابة غير المتزامنة التي تم بدءها

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
