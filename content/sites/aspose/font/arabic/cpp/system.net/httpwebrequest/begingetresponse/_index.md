---
title: "طريقة System::Net::HttpWebRequest::BeginGetResponse"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::HttpWebRequest::BeginGetResponse. تبدأ طلبًا غير متزامنًا للمورد في C++."
type: docs
weight: 500
url: /ar/cpp/system.net/httpwebrequest/begingetresponse/
---
## HttpWebRequest::BeginGetResponse method


يبدأ طلبًا غير متزامنًا للمورد.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
