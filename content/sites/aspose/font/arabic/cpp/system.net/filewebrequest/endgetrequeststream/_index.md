---
title: "طريقة System::Net::FileWebRequest::EndGetRequestStream"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::FileWebRequest::EndGetRequestStream. تنتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق في C++."
type: docs
weight: 500
url: /ar/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
