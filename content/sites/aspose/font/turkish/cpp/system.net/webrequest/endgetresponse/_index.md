---
title: "System::Net::WebRequest::EndGetResponse metodu"
linktitle: "EndGetResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::WebRequest::EndGetResponse metodu. Belirtilen asenkron isteğin kaynak için tamamlanmasını C++'da bekler."
type: docs
weight: 1300
url: /tr/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


Kaynak için belirtilen eşzamansız isteğin tamamlanmasını bekler.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
