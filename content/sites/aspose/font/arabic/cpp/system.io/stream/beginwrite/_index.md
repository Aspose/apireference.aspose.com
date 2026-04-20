---
title: "طريقة System::IO::Stream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::Stream::BeginWrite. تُبدأ عملية كتابة غير متزامنة في C++."
type: docs
weight: 200
url: /ar/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


يبدأ عملية كتابة غير متزامنة.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مخزن مؤقت يحتوي على البيانات التي سيتم كتابتها |
| إزاحة | int | إزاحة تبدأ من الصفر في **buffer** تشير إلى الموضع الذي تبدأ منه البيانات للكتابة |
| count | int | عدد البايتات التي سيتم كتابتها |
| استدعاء رد | System::AsyncCallback | استدعاء رد نداء يُستدعى عند إكمال العملية |
| الحالة | System::SharedPtr\<System::Object\> | البيانات التي يقدمها المستخدم وتُستخدم لتحديد كل عملية كتابة غير متزامنة بشكل فريد |

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
* Library [Aspose.Font for C++](../../../)
