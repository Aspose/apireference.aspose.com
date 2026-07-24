---
title: "System::Net::WebRequest::EndGetResponse yöntemi"
linktitle: "EndGetResponse"
second_title: "Aspose.Page için C++"
description: "System::Net::WebRequest::EndGetResponse yöntemi. C++'de kaynak için belirtilen eşzamansız isteğin tamamlanmasını bekler."
type: docs
weight: 1300
url: /tr/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


Kaynak için belirtilen asenkron isteğin tamamlanmasını bekler.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
