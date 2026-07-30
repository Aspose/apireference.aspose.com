---
title: "طريقة System::Net::FileWebRequest::BeginGetRequestStream"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::FileWebRequest::BeginGetRequestStream. تُطلق عملية غير متزامنة للحصول على تدفق لكتابة البيانات إلى المورد في C++."
type: docs
weight: 300
url: /ar/cpp/system.net/filewebrequest/begingetrequeststream/
---
## FileWebRequest::BeginGetRequestStream method


يبدأ عملية غير متزامنة للحصول على تدفق لكتابة البيانات إلى المورد.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
