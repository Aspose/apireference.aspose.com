---
title: "System::Net::WebRequest::EndGetResponse طريقة"
linktitle: "EndGetResponse"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::WebRequest::EndGetResponse. ينتظر حتى يكتمل الطلب غير المتزامن المحدد للمورد في C++."
type: docs
weight: 1300
url: /ar/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


ينتظر حتى يكتمل الطلب غير المتزامن المحدد للمورد.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل طلبًا غير متزامن للمورد. |

### ReturnValue

استجابة الويب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
