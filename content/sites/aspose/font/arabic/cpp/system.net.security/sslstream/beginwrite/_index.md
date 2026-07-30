---
title: "طريقة System::Net::Security::SslStream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Security::SslStream::BeginWrite. تبدأ عملية كتابة غير متزامنة في C++."
type: docs
weight: 400
url: /ar/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


يبدأ عملية كتابة غير متزامنة.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايتات لكتابة البيانات إليها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| count | int32_t | عدد البايتات التي سيتم كتابتها. |
| asyncCallback | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| asyncState | System::SharedPtr\<Object\> | البيانات التي يقدمها المستخدم تُستخدم لتحديد كل عملية كتابة غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية الكتابة غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
