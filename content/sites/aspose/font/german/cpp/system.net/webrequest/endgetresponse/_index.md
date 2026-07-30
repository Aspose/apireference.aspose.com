---
title: "System::Net::WebRequest::EndGetResponse-Methode"
linktitle: "EndGetResponse"
second_title: "Aspose.Font für C++"
description: "System::Net::WebRequest::EndGetResponse-Methode. Wartet, bis die angegebene asynchrone Anforderung für die Ressource in C++ abgeschlossen ist."
type: docs
weight: 1300
url: /de/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


Wartet, bis die angegebene asynchrone Anforderung für die Ressource abgeschlossen ist.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
