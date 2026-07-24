---
title: "طريقة System::Net::HttpWebRequest::EndGetRequestStream"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::HttpWebRequest::EndGetRequestStream. تنتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق في C++."
type: docs
weight: 600
url: /ar/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق.

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية غير متزامنة للحصول على تدفق. |

### ReturnValue

الدفق لكتابة البيانات إلى المورد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
