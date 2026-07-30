---
title: "طريقة System::Net::WebRequest::BeginGetRequestStream"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::WebRequest::BeginGetRequestStream. تبدأ عملية غير متزامنة للحصول على دفق لكتابة البيانات إلى المورد في C++."
type: docs
weight: 1000
url: /ar/cpp/system.net/webrequest/begingetrequeststream/
---
## WebRequest::BeginGetRequestStream method


يبدأ عملية غير متزامنة للحصول على تدفق لكتابة البيانات إلى المورد.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| الحالة | System::SharedPtr\<Object\> | بيانات يقدمها المستخدم تُستخدم لتحديد كل عملية غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل العملية غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
