---
title: "System::Net::HttpWebRequest::EndGetResponse method"
linktitle: "EndGetResponse"
second_title: "Aspose.Page لـ C++"
description: "System::Net::HttpWebRequest::EndGetResponse method. ينتظر حتى يكتمل الطلب غير المتزامن المحدد للمورد في C++."
type: docs
weight: 700
url: /ar/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


ينتظر حتى يكتمل الطلب غير المتزامن المحدد للمورد.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل طلبًا غير متزامنًا للمورد. |

### ReturnValue

استجابة الويب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
