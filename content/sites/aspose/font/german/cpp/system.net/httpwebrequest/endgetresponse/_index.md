---
title: "System::Net::HttpWebRequest::EndGetResponse-Methode"
linktitle: "EndGetResponse"
second_title: "Aspose.Font für C++"
description: "System::Net::HttpWebRequest::EndGetResponse-Methode. Wartet, bis die angegebene asynchrone Anforderung für die Ressource in C++ abgeschlossen ist."
type: docs
weight: 700
url: /de/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


Wartet, bis die angegebene asynchrone Anforderung für die Ressource abgeschlossen ist.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das eine asynchrone Anforderung für die Ressource darstellt. |

### ReturnValue

Die Webantwort.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
