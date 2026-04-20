---
title: "System::Net::HttpWebRequest::EndGetRequestStream طريقة"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font لـ C++"
description: "System::Net::HttpWebRequest::EndGetRequestStream طريقة. ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق في C++."
type: docs
weight: 600
url: /ar/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق.

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
