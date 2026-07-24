---
title: "طريقة System::Net::WebRequest::BeginGetResponse"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::WebRequest::BeginGetResponse. تبدأ طلبًا غير متزامن للموارد في C++."
type: docs
weight: 1100
url: /ar/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


يبدأ طلبًا غير متزامنًا للمورد.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| الحالة | System::SharedPtr\<Object\> | بيانات مقدمة من المستخدم تُستخدم لتحديد كل عملية غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل العملية غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
