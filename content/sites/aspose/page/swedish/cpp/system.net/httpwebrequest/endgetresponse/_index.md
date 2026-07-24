---
title: "System::Net::HttpWebRequest::EndGetResponse metod"
linktitle: "EndGetResponse"
second_title: "Aspose.Page för C++"
description: "System::Net::HttpWebRequest::EndGetResponse metod. Väntar tills den angivna asynkrona förfrågan om resursen är klar i C++."
type: docs
weight: 700
url: /sv/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


Väntar tills den angivna asynkrona begäran om resursen är klar.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ett [IAsyncResult](../../../system/iasyncresult/)-objekt som representerar en asynkron förfrågan om resursen. |

### ReturnValue

Webbresponsen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
