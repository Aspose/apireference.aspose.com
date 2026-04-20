---
title: "طريقة System::Net::WebRequest::EndGetRequestStream"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::WebRequest::EndGetRequestStream. تنتظر حتى يكتمل العملية غير المتزامنة المحددة للحصول على تدفق في C++."
type: docs
weight: 1200
url: /ar/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية غير متزامنة للحصول على تدفق. |

### ReturnValue

الدفق لكتابة البيانات إلى المورد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
