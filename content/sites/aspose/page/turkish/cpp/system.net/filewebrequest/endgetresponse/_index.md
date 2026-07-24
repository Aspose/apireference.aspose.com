---
title: "System::Net::FileWebRequest::EndGetResponse metodu"
linktitle: "EndGetResponse"
second_title: "Aspose.Page için C++"
description: "System::Net::FileWebRequest::EndGetResponse metodu. C++'ta belirtilen eşzamansız kaynak isteği tamamlanana kadar bekler."
type: docs
weight: 600
url: /tr/cpp/system.net/filewebrequest/endgetresponse/
---
## FileWebRequest::EndGetResponse method


Kaynak için belirtilen asenkron isteğin tamamlanmasını bekler.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::FileWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Kaynak için asenkron bir isteği temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi. |

### ReturnValue

Web yanıtı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
