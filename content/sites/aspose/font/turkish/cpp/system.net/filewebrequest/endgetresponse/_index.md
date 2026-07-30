---
title: "System::Net::FileWebRequest::EndGetResponse metodu"
linktitle: "EndGetResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::FileWebRequest::EndGetResponse metodu. C++'ta belirtilen asenkron isteğin kaynak için tamamlanmasını bekler."
type: docs
weight: 600
url: /tr/cpp/system.net/filewebrequest/endgetresponse/
---
## FileWebRequest::EndGetResponse method


Kaynak için belirtilen eşzamansız isteğin tamamlanmasını bekler.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::FileWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
