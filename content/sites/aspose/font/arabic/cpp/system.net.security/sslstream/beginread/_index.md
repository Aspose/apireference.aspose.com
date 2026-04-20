---
title: "System::Net::Security::SslStream::BeginRead طريقة"
linktitle: "BeginRead"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Security::SslStream::BeginRead طريقة. يبدأ عملية قراءة غير متزامنة في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


يبدأ عملية قراءة غير متزامنة.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايتات لقراءة البيانات منها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| count | int32_t | عدد البايتات التي سيتم قراءتها. |
| asyncCallback | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| asyncState | System::SharedPtr\<Object\> | بيانات مقدمة من المستخدم تُستخدم لتحديد كل عملية قراءة غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية القراءة غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
