---
title: "System::Net::HttpWebRequest::EndGetResponse yöntemi"
linktitle: "EndGetResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::HttpWebRequest::EndGetResponse yöntemi. C++'da belirtilen asenkron isteğin kaynak için tamamlanmasını bekler."
type: docs
weight: 700
url: /tr/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


Kaynak için belirtilen eşzamansız isteğin tamamlanmasını bekler.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Kaynak için bir asenkron isteği temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi. |

### ReturnValue

Web yanıtı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
